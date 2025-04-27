package com.codigo.ms_orders.service.impl;

import com.codigo.ms_orders.agregates.dto.OrderLineItemsRequest;
import com.codigo.ms_orders.agregates.dto.OrderRequest;
import com.codigo.ms_orders.model.Order;
import com.codigo.ms_orders.model.OrderLineItems;
import com.codigo.ms_orders.repository.OrderRepository;
import com.codigo.ms_orders.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public void createOrder(OrderRequest orderRequest) {
        Order order = Order.builder()
                .orderNumber(UUID.randomUUID().toString())
                .orderLineItems(orderRequest.getOrderLineItems()
                    .stream()
                    .map(this::mapToOrderLineItem)
                    .toList())
                .build();

        orderRepository.save(order);
    }



    private OrderLineItems mapToOrderLineItem(OrderLineItemsRequest orderLineItemRequest) {
        return OrderLineItems.builder()
                .skuCode(orderLineItemRequest.getSkuCode())
                .price(orderLineItemRequest.getPrice())
                .quantity(orderLineItemRequest.getQuantity())
                .build();
    }


}

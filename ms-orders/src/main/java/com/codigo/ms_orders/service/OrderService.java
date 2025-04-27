package com.codigo.ms_orders.service;

import com.codigo.ms_orders.agregates.dto.OrderRequest;

public interface OrderService {
    void createOrder (OrderRequest orderRequest);
}

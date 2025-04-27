package com.codigo.ms_orders.agregates.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsRequest {
    private Long id;
    private String skuCode;
    private String price;
    private Integer quantity;
}

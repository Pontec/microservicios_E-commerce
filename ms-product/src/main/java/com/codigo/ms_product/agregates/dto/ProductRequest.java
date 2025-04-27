package com.codigo.ms_product.agregates.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequest {
    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private Boolean available;
    private Integer stock;

}

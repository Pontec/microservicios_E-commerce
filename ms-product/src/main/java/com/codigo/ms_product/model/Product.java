package com.codigo.ms_product.model;

import lombok.*;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "products")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private Boolean available;
    private Integer stock;
}

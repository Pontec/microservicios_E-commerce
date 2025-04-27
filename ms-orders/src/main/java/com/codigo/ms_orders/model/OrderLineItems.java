package com.codigo.ms_orders.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_line_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderLineItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private String price;
    private Integer quantity;


}

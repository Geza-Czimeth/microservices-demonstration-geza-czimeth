package com.bigfish.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "warehouse_records")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private Integer quantity;
    private Double price;
}

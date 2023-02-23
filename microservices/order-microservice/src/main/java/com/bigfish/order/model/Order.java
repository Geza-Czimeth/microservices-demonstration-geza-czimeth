package com.bigfish.order.model;

import lombok.Data;

@Data
public class Order {
    private String product;
    private Integer quantity;
    private Double price;
}

package com.bigfish.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OrderDto{

    @NotNull
    @NotEmpty
    private  String product;
    @NotNull
    private  Integer quantity;
}

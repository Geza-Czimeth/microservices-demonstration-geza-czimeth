package com.bigfish.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record OrderDto(@NotNull @NotEmpty String product, @NotNull Integer quantity) {
}

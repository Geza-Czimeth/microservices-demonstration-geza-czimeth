package com.bigfish.order.controller;

import com.bigfish.dto.OrderDto;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
@Slf4j
public class OrderServiceController {

    @PostMapping()
    public ResponseEntity<OrderDto> order(@RequestBody @Valid OrderDto orderDto) {
        log.info(String.format("Order service received order -> %s", orderDto));
        return ResponseEntity.ok(orderDto);
    }
}

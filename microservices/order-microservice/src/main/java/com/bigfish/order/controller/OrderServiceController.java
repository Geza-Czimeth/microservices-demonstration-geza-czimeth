package com.bigfish.order.controller;

import com.bigfish.dto.OrderDto;
import com.bigfish.order.model.Order;
import com.bigfish.order.service.OrderService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
@Slf4j
@AllArgsConstructor
public class OrderServiceController {

    private ModelMapper modelMapper;
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderDto> order(@RequestBody @Valid OrderDto orderDto) {
        log.info(String.format("Order service received order -> %s", orderDto));
        Order order = modelMapper.map(orderDto, Order.class);
        final OrderDto processedOrder = orderService.takeOrder(order);
        return ResponseEntity.ok(processedOrder);
    }
}

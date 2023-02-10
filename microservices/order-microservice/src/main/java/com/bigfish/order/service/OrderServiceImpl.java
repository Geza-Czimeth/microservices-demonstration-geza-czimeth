package com.bigfish.order.service;

import com.bigfish.dto.OrderDto;
import com.bigfish.entity.Order;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class OrderServiceImpl implements OrderService{

    private ModelMapper modelMapper;

    @Override
    public OrderDto takeOrder(Order order) {
        log.info(String.format("Order service taken order -> %s", order));
        OrderDto orderDto = modelMapper.map(order, OrderDto.class);
        return orderDto;
    }
}

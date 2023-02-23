package com.bigfish.order.service;

import com.bigfish.dto.OrderDto;
import com.bigfish.order.model.Order;
import com.bigfish.order.producer.RabbitMQJsonProducer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final ModelMapper modelMapper;
    private final RabbitMQJsonProducer producer;

    @Override
    public OrderDto takeOrder(Order order) {
        log.info(String.format("Order service taken order -> %s", order));
        producer.sendJsonMessage(order);
        return modelMapper.map(order, OrderDto.class);
    }
}

package com.bigfish.order.service;

import com.bigfish.dto.OrderDto;
import com.bigfish.entity.Order;

public interface OrderService {

    OrderDto takeOrder(Order order);
}

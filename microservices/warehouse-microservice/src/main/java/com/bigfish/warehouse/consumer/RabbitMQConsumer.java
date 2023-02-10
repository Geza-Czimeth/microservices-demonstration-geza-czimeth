package com.bigfish.warehouse.consumer;

import com.bigfish.entity.Order;
import com.bigfish.warehouse.persistence.WarehouseRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class RabbitMQConsumer {

    private WarehouseRepository warehouseRepository;

    @RabbitListener(queues = "${rabbitmq.warehouse.queue.json.name}")
    public void consume(Order order){
        log.info("Message received in warehouse microservice: "+ order);
        warehouseRepository.save(order);
    }
}

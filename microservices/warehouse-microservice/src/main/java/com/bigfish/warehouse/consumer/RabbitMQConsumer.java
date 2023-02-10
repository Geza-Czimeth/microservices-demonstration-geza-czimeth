package com.bigfish.warehouse.consumer;

import com.bigfish.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQConsumer {

    @RabbitListener(queues = "${rabbitmq.warehouse.queue.json.name}")
    public void consume(Order order){
        log.info("Message received in warehouse microservice: "+ order);
    }
}

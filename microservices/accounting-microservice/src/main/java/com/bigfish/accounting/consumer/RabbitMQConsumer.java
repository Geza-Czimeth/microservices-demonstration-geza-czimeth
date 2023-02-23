package com.bigfish.accounting.consumer;

import com.bigfish.accounting.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQConsumer {

    @RabbitListener(queues = "${rabbitmq.accounting.queue.json.name}")
    public void consume(Order order){
        log.info("Message received in accounting microservice: "+ order);
    }
}

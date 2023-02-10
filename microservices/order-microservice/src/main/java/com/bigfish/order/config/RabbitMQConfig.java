package com.bigfish.order.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${rabbitmq.warehouse.queue.json.name}")
    private String wareHouseQueueName;
    @Value("${rabbitmq.accounting.queue.json.name}")
    private String accountingQueueName;
    @Value("${rabbitmq.exchange.name}")
    private String exchange;
    @Value("${rabbitmq.routing.key.json}")
    private String routingKey;

    @Bean
    public Queue warehouseQueue(){
        return new Queue(wareHouseQueueName);
    }

    @Bean
    public Queue accountingQueue(){
        return new Queue(accountingQueueName);
    }
    @Bean
    public TopicExchange exchange(){
        return new TopicExchange(exchange);
    }

    @Bean
    public Binding accountingBinding(){
        return BindingBuilder.bind(accountingQueue()).to(exchange()).with(routingKey);
    }

    @Bean
    public Binding warehouseBinding(){
        return BindingBuilder.bind(warehouseQueue()).to(exchange()).with(routingKey);
    }

    @Bean
    public MessageConverter converter(){
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory){
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(converter());
        return rabbitTemplate;
    }
}

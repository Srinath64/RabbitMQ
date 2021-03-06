package com.example.rabbitmq.demo.consumer;

import com.example.rabbitmq.demo.config.MessagingConfig;
import com.example.rabbitmq.demo.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message Received from queue : " + orderStatus);
    }
}

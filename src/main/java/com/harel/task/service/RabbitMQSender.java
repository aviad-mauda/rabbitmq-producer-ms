package com.harel.task.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${harel.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${harel.rabbitmq.routingkey}")
	private String routingkey;	
	
	public String send(String name) {
		rabbitTemplate.convertAndSend(exchange, routingkey, name);
		return "Send msg = " + name;
	}
}

package com.harel.task;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableRabbit
@SpringBootApplication
public class RabbitMQWriterApp {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMQWriterApp.class, args);
	}

}

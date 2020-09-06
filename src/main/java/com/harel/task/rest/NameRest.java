package com.harel.task.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harel.task.service.RabbitMQSender;

@RestController
@RequestMapping("/")
public class NameRest {

	@Autowired
	RabbitMQSender rabbitMQSender;
	
	@PostMapping("/writeMassage")
    public String insert(@RequestBody String name) {
		return rabbitMQSender.send(name);
    }
}

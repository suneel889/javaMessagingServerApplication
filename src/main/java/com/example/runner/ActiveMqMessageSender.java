package com.example.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqMessageSender implements CommandLineRunner {

	@Autowired
	JmsTemplate template;
	
	
	@Override
	public void run(String... args) throws Exception {
		template.send("quee1",ses->ses.createTextMessage("Message send at the time of::"+new Date()));
		System.out.println("Message Send from Message sender");

	}

}

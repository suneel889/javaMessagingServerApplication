package com.example.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JmsMessageSender {
    @Autowired
	private JmsTemplate template;
	
	@Scheduled(cron="*/10 * * * * * ")
	public void messageSender() {
		
		
		template.send("quee2",ses->ses.createTextMessage("Message send from quee2"+new Date()));
		System.out.println("Sheduling is unabled");
		
	}
	
	
}

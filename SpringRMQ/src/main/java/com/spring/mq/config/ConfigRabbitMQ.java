package com.spring.mq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Suersh Sadanala
 *
 */
@Configuration
public class ConfigRabbitMQ {
	
	public static String QUEUE_NAME = "queue1";
	public static String EXCHANGE_NAME = "exchange1";
	
	@Bean
	Queue getQueue() {
		return new Queue(QUEUE_NAME, false);
	}
	
	@Bean
	TopicExchange exchange() {
		return new TopicExchange(EXCHANGE_NAME);
	}

}

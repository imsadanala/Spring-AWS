package com.spring.mq.consumer;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Sueresh Sadanala
 *
 */
@Service
@Slf4j
public class RecieveMessageHandler {
	public void handleMessage(String messageBody) {
		System.out.println("HandleMessage");
		System.out.println(messageBody);
	}
}

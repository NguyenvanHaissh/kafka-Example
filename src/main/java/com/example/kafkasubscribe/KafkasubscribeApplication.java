package com.example.kafkasubscribe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KafkasubscribeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(KafkasubscribeApplication.class, args);
	}

}

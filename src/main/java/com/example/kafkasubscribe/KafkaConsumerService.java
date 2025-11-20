package com.example.kafkasubscribe;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "test",groupId = "my-group")
    public void listen(String message){
        System.out.println("tin nhan da nhan" + message);
    }
}

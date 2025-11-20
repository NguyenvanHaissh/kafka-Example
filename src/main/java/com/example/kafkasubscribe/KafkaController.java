package com.example.kafkasubscribe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private final KafkaProducerService producerService;
    @Autowired
    public KafkaController(KafkaProducerService producerService){
        this.producerService = producerService;
    }
    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message){
        producerService.sendMessage("test", message);
        return new ResponseEntity<>("Message published to Kafka topic",HttpStatus.OK);
    }
}

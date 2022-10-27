package com.example.kafka.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

/**
 * @author cosmoxu
 * @version consumer, v 0.1 2022/9/28 15:33
 */
@Slf4j
@Component
public class consumer {

    @KafkaListener(id = "webGroup1", topics = "topic1")
    public void listen(String input) {
        System.out.println("input value:" + input);
    }

    @KafkaListener(id = "webGroup2", topics = "topic1")
    public void listenGroup(ConsumerRecord<String, String> record, Acknowledgment ack) {
        System.out.println("input value:" + record.value());
        //手动提交
        ack.acknowledge();
    }
}

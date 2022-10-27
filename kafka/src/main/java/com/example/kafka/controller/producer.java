package com.example.kafka.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author cosmoxu
 * @version producer, v 0.1 2022/9/28 10:28
 */

@Slf4j
@RestController
public class producer {

    @Autowired
    private KafkaTemplate<Object, Object> template;

    private final static String topicName = "topic1";

    @GetMapping("/send/{input}")
    public void sendFoo(@PathVariable String input) {
        template.send(topicName, input);
        log.info(">>>>>>>>发送成功");
    }

}

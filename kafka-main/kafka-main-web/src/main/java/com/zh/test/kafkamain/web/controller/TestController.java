package com.zh.test.kafkamain.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author :zh
 * @date : 2023/9/13
 * @description :
 */
@Slf4j
@RestController
public class TestController {
    @Resource
    KafkaTemplate<Object,Object> template;

    @GetMapping("/send")
    public void sendMsg(@RequestParam("input")String input){
        template.send("topic_input",input);
    }

    @KafkaListener(id="webGroup",topics = "topic_input")
    public void listen(String input){
        log.info("input value :{}",input);
    }
}

package com.zh.test.kafkamain.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"com.zh.test.kafkamain"})
public class KafkaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaWebApplication.class, args);
        log.info("kafka-main launch success!");
    }

}

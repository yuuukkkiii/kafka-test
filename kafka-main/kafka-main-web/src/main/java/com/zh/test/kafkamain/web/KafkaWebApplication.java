package com.zh.test.kafkamain.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zh.test.kafkamain"})
public class KafkaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaWebApplication.class, args);
    }

}

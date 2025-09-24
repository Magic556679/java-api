package com.example.java_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String hello() {
        logger.info("GET / 被呼叫了");
        return "Hello Spring Boot!";
    }

    @PostMapping("/echo")
    public String echo(@RequestBody String body) {
        logger.info("echo / 被呼叫了");
        return "You sent: " + body;
    }
}

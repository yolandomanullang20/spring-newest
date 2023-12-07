package com.yolandomanullang.cobaapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello-world")
public class HelloWorld {

    Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    @GetMapping
    public String helloWorld() {
        logger.info("Hello World!");
        return "Hello World!";
    }

}

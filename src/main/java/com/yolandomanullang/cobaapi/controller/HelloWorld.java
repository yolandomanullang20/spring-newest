package com.yolandomanullang.cobaapi.controller;

import com.yolandomanullang.cobaapi.utils.messages.CommonResponse;
import com.yolandomanullang.cobaapi.utils.messages.CommonResponseGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello-world")
public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    private final CommonResponseGenerator commonResponseGenerator;

    public HelloWorld(CommonResponseGenerator commonResponseGenerator) {
        this.commonResponseGenerator = commonResponseGenerator;
    }


    @GetMapping
    public CommonResponse<String> helloWorld() {
        logger.info("Hello World!");
        return commonResponseGenerator.commonSuccessResponse(null, "Hello World!");
    }

}

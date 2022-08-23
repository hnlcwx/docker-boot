package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/test/docker")
    public String helloDocker(){
        return "hello docker"+"\t"+port+"\t"+ UUID.randomUUID().toString();
    }

    @RequestMapping("/test/index")
    public String index(){
        System.out.println("hello git");
        return "服务端口号："+"\t"+port+"\t"+ UUID.randomUUID().toString();
    }
}

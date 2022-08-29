package cn.gdsdxy.springboot01helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/HelloWorld")
    public String hello() {
        return "200114240项国新，欢迎您来学习SpringBoot！";
    }
}

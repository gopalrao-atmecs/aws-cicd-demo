package com.example.awscicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cicd")
public class HelloWorldController{

    @GetMapping(value = "/health")
    public String hello() {

        return "OK..";

    }

}
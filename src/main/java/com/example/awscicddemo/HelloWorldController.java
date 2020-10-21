package com.example.awscicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@RequestMapping("/cicd")
public class HelloWorldController{

    @GetMapping(value = "/health")
    @CrossOrigin(origins = "*")
    public String hello() {

        return "OK..";

    }

}
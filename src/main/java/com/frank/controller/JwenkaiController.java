package com.frank.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwenkaiController {
    @Value("${frank:test}")
    public  String frank;
    @GetMapping("/hello")
    public String say(){
        return "hello springboot";
    }
}

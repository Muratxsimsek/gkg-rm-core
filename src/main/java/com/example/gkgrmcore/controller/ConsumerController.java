package com.example.gkgrmcore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @GetMapping("/message")
    public String test() {
        return "Hello JavaInUse Called in Second Service";
    }

}
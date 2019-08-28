package com.alive.service2.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hi")
public class HiController {

    @GetMapping("text")
    public String hi() {
        return "service 02 hi";
    }

    @GetMapping("receive")
    public String receive(String name) {
        return "service 02 receive：" + name;
    }
}

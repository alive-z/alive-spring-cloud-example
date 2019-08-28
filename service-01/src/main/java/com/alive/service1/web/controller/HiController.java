package com.alive.service1.web.controller;

import com.alive.service1.feign.FeignServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hi")
public class HiController {

    @Autowired
    private FeignServiceHi feignServiceHi;

    @GetMapping("text")
    public String hi() {
        return "service 01 hi";
    }

    @GetMapping("to-02")
    public String toService02() {
        return feignServiceHi.sayHiFromClientOne("2222");
    }
}

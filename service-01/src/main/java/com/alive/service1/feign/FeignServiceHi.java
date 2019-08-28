package com.alive.service1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "alive-service-02")
public interface FeignServiceHi {

    @RequestMapping(value = "/hi/receive", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
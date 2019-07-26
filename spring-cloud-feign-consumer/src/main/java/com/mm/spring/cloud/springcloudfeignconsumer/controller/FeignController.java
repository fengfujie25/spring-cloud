package com.mm.spring.cloud.springcloudfeignconsumer.controller;

import com.mm.spring.cloud.springcloudfeignconsumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @auther fujie.feng
 * @DateTime: 2019-06-17
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/feign")
    public String feign() {
        return feignService.feignConsumer();
    }
}

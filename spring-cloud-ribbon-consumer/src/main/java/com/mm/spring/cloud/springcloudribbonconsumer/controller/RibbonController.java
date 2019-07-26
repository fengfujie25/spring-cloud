package com.mm.spring.cloud.springcloudribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @auther fujie.feng
 * @DateTime: 2019-06-17
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon")
    public String hello() {
        return restTemplate.getForObject("http://spring-cloud-eureka-client/hello", String.class);
    }
}

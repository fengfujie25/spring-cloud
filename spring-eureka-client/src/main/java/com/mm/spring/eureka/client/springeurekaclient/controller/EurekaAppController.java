package com.mm.spring.eureka.client.springeurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @auther fujie.feng
 * @DateTime: 2019-06-17
 */
@RestController
public class EurekaAppController {

    @Autowired
    private DiscoveryClient discoveryClient;


    @RequestMapping("/hello")
    public String hello() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println("spring cloud eureka client --->" + services);
        return services;
    }
}

package com.mm.spring.cloud.eureka.springcloudeurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @auther fujie.feng
 * @DateTime: 2019-06-17
 */
@RestController
public class ConsumerController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("spring-cloud-eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hello";

        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
}

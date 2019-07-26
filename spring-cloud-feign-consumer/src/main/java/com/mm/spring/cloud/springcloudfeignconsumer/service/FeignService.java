package com.mm.spring.cloud.springcloudfeignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("spring-cloud-eureka-client")
public interface FeignService {

    @GetMapping("/hello")
    String feignConsumer();
}

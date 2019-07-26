package com.mm.spring.cloud.eureka.springcloudeurekaconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @auther fujie.feng
 * @DateTime: 2019-06-17
 */
@Configuration
public class BeanConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

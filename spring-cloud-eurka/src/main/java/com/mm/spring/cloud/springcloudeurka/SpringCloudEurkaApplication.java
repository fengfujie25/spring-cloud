package com.mm.spring.cloud.springcloudeurka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurkaApplication.class, args);
    }

}

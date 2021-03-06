package com.fsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IPOserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(IPOserviceApplication.class,args);
    }
}

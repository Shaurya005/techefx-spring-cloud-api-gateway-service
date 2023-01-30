package com.techefx.microservices.springcloudapigatewayservice.techefxspringcloudapigatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Creating Spring Cloud Gateway service which is also called Non blocking api gateway. Note you must have seen the other services were
// using tomcat to start the service but here you can see spring cloud api gateway uses netty to start the service.
@SpringBootApplication
public class TechefxSpringCloudApiGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechefxSpringCloudApiGatewayServiceApplication.class, args);
    }

}

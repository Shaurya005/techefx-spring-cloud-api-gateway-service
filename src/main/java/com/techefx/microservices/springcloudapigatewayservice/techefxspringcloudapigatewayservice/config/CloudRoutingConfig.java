package com.techefx.microservices.springcloudapigatewayservice.techefxspringcloudapigatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
So far we have seen how we have enabled the spring cloud routing for enquiry service and we were able to access the enquiry service endpoint through spring cloud api
gateway right so as you can see we executed this product-enquiry endpoint by using api gateway url and we are able to get the data from all those instances of stock
service. For doing this we configured the routing service in application.yaml file. Additionally, we can enable routing through other way around like by using configuration file
both are the same and it's just matter of choosing the option.

Let me demonstrate you how we can do it through config file. For that let's create a new Class CloudRoutingConfig inside new package called config.
Since this is a configuration file, just annotate it with the @Configuration and primarily this file will have one method with return type RouteLocator
so write one method with a return type of RouteLocator and the parameter of RouteLocatorBuilder.
Through this builder just add a route and inside this route, use a predicate, use the path so remember we had used the path exactly as in application.yaml so the
same path we can copy and use it here in a path and now let's go to application.yaml copy the uri
just put it inside the .uri, give the id which you can again copy from application.yaml i.e. stock-enquiry and finally build this using build() method.

So this is the way you can build it out if you don't want to use through yaml file, so you will need to create a class which will have one method with return
type of RouteLocator with the argument RouteLocatorBuilder through this builder you need to create a predicates exactly same what we are defined in application.yaml
this predicate will have a path, the uri and the id that's it.  so now for executing this you'll have to comment out cloud gateway routes in application.yaml file.

So we discussed about how we can configure routing, first way is to do it through application.yaml and second way is to write a config file with the help of RouteLocator.
 */
@Configuration
public class CloudRoutingConfig {

/* @Bean
   public RouteLocator gatewayRoutes(RouteLocatorBuilder builder)
    {
        return builder.routes().route(
                r->r.path("/product-enquiry/**")
                .uri("http://localhost:8700/")
                .id("stock-enquiry")
        ).build();

    }*/
}
package org.sample.spring.controller;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class RestaurantController {

    private final ServiceProperties serviceProperties;

    public RestaurantController(ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }

    public String message() {
    		if (this.serviceProperties.getMessage() == null || this.serviceProperties.getMessage().isEmpty()) {
    			return "Not found message";
    		} else {
    			return this.serviceProperties.getMessage();
    		}
    }
}

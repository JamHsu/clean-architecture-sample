package spring.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MyService {

    private final ServiceProperties serviceProperties;

    public MyService(ServiceProperties serviceProperties) {
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

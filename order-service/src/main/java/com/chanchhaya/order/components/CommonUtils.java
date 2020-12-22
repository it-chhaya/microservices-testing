package com.chanchhaya.order.components;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CommonUtils {
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

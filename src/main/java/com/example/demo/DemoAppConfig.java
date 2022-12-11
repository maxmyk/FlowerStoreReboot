package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoAppConfig {
    @Bean
    public String getData(){
        //		Item item = new FlowerBucket();
//		return new Flower(FlowerType.CHAMOMILE, 19.6, 2).toString();
        return "Something";
    }
}

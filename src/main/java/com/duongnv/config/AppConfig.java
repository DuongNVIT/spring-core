package com.duongnv.config;

import com.duongnv.model.MediumMonitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.duongnv")
public class AppConfig {

    @Bean
    public MediumMonitor mediumMonitor() {
        return new MediumMonitor();
    }
}

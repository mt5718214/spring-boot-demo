package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public Printer myPrinter() {
        return new CanonPrinter();
    }

    @Bean
    public String showStr() {
        return "我是一個字串";
    }
}

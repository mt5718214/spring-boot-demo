package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HpPrinter implements Printer {

    private int count;

    @PostConstruct
    public void init() {
        count = 10;
    }

    @Override
    public void print(String message) {
        count--;
        System.out.println("Hp印表機" + message);
        System.out.println("剩餘使用次數： " + count);
    }
}

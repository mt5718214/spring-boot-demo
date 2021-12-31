package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HpPrinter implements Printer {

    @Value("${printer.name}")
    private String name;

    @Value("${printer.count:20}") //冒號後的值為預設值
    private int count;

    @Override
    public void print(String message) {
        count--;
        System.out.println(name + ": " + message);
        System.out.println("剩餘使用次數： " + count);
    }
}

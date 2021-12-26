package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    @Qualifier("myPrinter")
    private Printer printer;

    @Autowired
    private String str;

    @GetMapping("/test")
    public String test() {
        System.out.println(str);
        printer.print("Hello world");
        return "Hello world";
    }

}

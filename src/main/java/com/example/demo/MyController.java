package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private Printer printer;

    @GetMapping("/test")
    public String test() {
        printer.print("Hello world");
        return "Hello world";
    }

}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/detail")  //此路徑會對應到每個方法, EX: .../detail/test
@RestController
public class MyController {

    @Autowired
    private Printer printer;

    @GetMapping("/test")
    public String test() {
        printer.print("Hello world");
        return "Hello world";
    }

    @RequestMapping("/user")
    public String user() {
        return "名字是Ken";
    }

}

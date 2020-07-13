package com.fullstack.springjavawebapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/{i}/{e}")
    public String tester(@PathVariable String i, @PathVariable String e) {
        return String.format("I: %1s\tE: %2s", i, e);
    }

}

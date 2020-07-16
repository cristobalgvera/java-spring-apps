package com.fullstack.testwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {
    @RequestMapping("/show-form") // By convention, usually mapping it's called like method's name
    public String showForm() {
        return "greet-form";
    }

    @RequestMapping("/process-form")
    public String processForm() {
        return "process-form";
    }
}

package com.fullstack.starterproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/index", "/user"})
public class IndexController {

    @RequestMapping("")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/test")
    public String getTest() {
        return "user/test";
    }
}

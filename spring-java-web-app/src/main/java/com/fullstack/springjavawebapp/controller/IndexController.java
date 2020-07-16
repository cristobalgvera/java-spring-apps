package com.fullstack.springjavawebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("var", 3);
        modelAndView.setViewName("index.jsp");
        return modelAndView;
    }

    @RequestMapping("/redirection")
    public String redirect() {
        return "redirect:/";
    }
}

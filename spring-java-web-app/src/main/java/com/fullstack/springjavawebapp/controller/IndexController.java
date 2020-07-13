package com.fullstack.springjavawebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("var", 3);
        return "jsp/index.jsp";
    }

    @RequestMapping("/redirection")
    public String redirect() {
        return "redirect:/";
    }
}

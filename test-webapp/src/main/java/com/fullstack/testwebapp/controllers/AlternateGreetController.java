package com.fullstack.testwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
    Controller's @RequestMapping route define the previous map before attempt to request maps that
    controller manage.

    Example: to access any method below, now we need to request 'http://localhost:8080/alternate-greet/show-form'.

    In JSP archives, now the index view have two ways to proceed. Beyond the index, everything remains
    the same due to the pedagogical example (when execute webapp look navigation bar to see the change).
*/

@Controller
@RequestMapping("/alternate-greet")
public class AlternateGreetController {
    @RequestMapping("/show-form") // Note that this method is called the same in the NormalGreetController.
    public String showForm() {
        return "greet-form";
    }

    @RequestMapping("/process-form")
    public String processForm() {
        return "process-form";
    }

    @RequestMapping("/process-form-concatenated")
    public String processFormConcatenated(@RequestParam("name") String alteredName, Model model) {
        alteredName += " (this is a concatenated string)";
        model.addAttribute("name", alteredName);
        return "process-form";
    }
}

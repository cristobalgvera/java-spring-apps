package com.fullstack.testwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/process-form-concatenated") // This change of name it's because we need to define an action for the <form> tag
    public String processFormConcatenated(HttpServletRequest request, Model model) { // Note: Model object it's part of Spring
        // Via request's parameters we call 'name' parameter and assign it to a variable
        String alteredName = request.getParameter("name");
        alteredName += " (this is a concatenated string)";
        // Using this Model object called 'model' via .addAttribute(...) method we can insert
        // parameters to be used by response view. Note that the first argument it's the name
        // to reference it in .jsp page (this case: name = 'name') and the second one it's
        // the object itself (this case: Object = (String) alteredName)
        model.addAttribute("name", alteredName);
        return "process-form";
    }
}

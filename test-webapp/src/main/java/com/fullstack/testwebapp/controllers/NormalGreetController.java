package com.fullstack.testwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/normal-greet")
// This annotation give controller more flexibility to name his @RequestMapping urls, because now
// references can be named equals to another references in others controllers (see AlternateGreetController)
public class NormalGreetController {
    @RequestMapping("/show-form") // By convention, usually mapping it's called like method's name
    public String showForm() {
        return "greet-form";
    }

    @RequestMapping("/process-form")
    public String processForm() {
        return "process-form";
    }

    @RequestMapping("/process-form-concatenated") // This change of name it's because we need to define an action for the <form> tag
    public String processFormConcatenated(@RequestParam("name") String alteredName, Model model) { // Note: Model object it's part of Spring
        /*
            Via @RequestParam("tag-name") now we can obtain values. This avoid to use request's
            .getParameter() method simplifying our functions
        */
        alteredName += " (this is a concatenated string)"; // This value already had tag named 'name' value
        /*
            Using this Model object called 'model' via .addAttribute(...) method we can insert
            parameters to be used by response view. Note that the first argument it's the name
            to reference it in .jsp page (this case: name = 'name') and the second one it's
            the object itself (this case: Object = (String) alteredName)
        */
        model.addAttribute("name", alteredName);
        return "process-form";
    }
}

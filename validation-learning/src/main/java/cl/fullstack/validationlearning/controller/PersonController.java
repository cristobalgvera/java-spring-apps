package cl.fullstack.validationlearning.controller;

import cl.fullstack.validationlearning.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class PersonController {
    @RequestMapping("/show-form")
    public String showForm(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "forms/validated-form";
    }

    @PostMapping("/registry")
    public String results(@Valid @ModelAttribute("person") Person person,
                          BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            System.out.println(person);
            return "forms/validated-form";
        }

        System.out.println(person);

        model.addAttribute("person", person);
        return "forms/registered";
    }
}

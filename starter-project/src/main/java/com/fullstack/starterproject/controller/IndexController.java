package com.fullstack.starterproject.controller;

import com.fullstack.starterproject.model.Persona;
import com.fullstack.starterproject.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping(value = {"/index", "/user"})
public class IndexController {

    @Autowired
    private PersonaService personaService;

    @RequestMapping("")
    public String getIndex(Model model) {
        Persona persona = new Persona();
        model.addAttribute("persona", persona);
        return "index";
    }

    @PostMapping("/test")
    public String getTest(@ModelAttribute("persona") Persona persona) {
        persona.setUserDate(new Date());
        personaService.save(persona);
        return "user/test";
    }
}

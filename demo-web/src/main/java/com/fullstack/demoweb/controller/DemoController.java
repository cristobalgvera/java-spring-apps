package com.fullstack.demoweb.controller;

import com.fullstack.demoweb.model.Persona;
import com.fullstack.demoweb.repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @Autowired
    private IPersonaRepo personaRepo;

    @Autowired
    private Persona persona;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                           Model model) {
        persona = new Persona();
        persona.setName(name);
        personaRepo.save(persona);
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("personas", personaRepo.findAll());
        return "greeting";
    }
}

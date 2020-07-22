package com.fullstack.demoweb.rest;

import com.fullstack.demoweb.model.Persona;
import com.fullstack.demoweb.repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class RestDemoController {

    /*
        BY CONVENTION:

        @PostMapping:   Create
        @GetMapping:    Read
        @PutMapping:    Update
        @DeleteMapping: Delete
     */

    @Autowired
    private IPersonaRepo personaRepo;

    @PostMapping
    public void insert(@RequestBody Persona persona) { // Annotation to request for JSON files
        personaRepo.save(persona);
    }

    @GetMapping
    public List<Persona> list() {
        return personaRepo.findAll();
    }

    @PutMapping
    public void modify(@RequestBody Persona persona) {
        personaRepo.save(persona);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        personaRepo.deleteById(id);
    }
}

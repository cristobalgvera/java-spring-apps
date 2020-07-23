package com.fullstack.starterproject.service;

import com.fullstack.starterproject.model.Persona;
import com.fullstack.starterproject.repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepo personaRepo;

    public Persona save(Persona persona) {
        return personaRepo.save(persona);
    }
}

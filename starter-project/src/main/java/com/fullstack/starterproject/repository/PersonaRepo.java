package com.fullstack.starterproject.repository;

import com.fullstack.starterproject.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long> {
}

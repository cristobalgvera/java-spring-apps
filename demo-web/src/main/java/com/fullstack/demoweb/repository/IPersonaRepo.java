package com.fullstack.demoweb.repository;

import com.fullstack.demoweb.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo extends JpaRepository<Persona, Long> {

}

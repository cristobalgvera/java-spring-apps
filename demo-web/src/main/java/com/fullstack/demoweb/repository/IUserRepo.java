package com.fullstack.demoweb.repository;

import com.fullstack.demoweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Long> {
    User findByName(String name);
}

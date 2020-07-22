package com.fullstack.springsecurityjpatest.repository;

import com.fullstack.springsecurityjpatest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Is a good practice user this Optional class
    Optional<User> findByUserName(String userName);
}

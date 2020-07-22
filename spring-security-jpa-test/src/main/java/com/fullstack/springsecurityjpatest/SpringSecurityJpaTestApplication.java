package com.fullstack.springsecurityjpatest;

import com.fullstack.springsecurityjpatest.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//// This annotation tells Spring Boot where packages are using JPA to communicate DB
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJpaTestApplication.class, args);
    }

}

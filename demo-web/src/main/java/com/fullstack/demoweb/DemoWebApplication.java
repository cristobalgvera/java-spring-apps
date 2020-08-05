package com.fullstack.demoweb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DemoWebApplication implements CommandLineRunner {

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println("'12345' : " + bCryptPasswordEncoder.encode("12345"));
        System.out.println("'98765' : " + bCryptPasswordEncoder.encode("98765"));
    }
}

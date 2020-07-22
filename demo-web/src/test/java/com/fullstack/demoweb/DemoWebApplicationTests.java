package com.fullstack.demoweb;

import com.fullstack.demoweb.model.User;
import com.fullstack.demoweb.repository.IUserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoWebApplicationTests {

    @Autowired
    private IUserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Test
    void createUserTest() {
        User user = new User();
        user.setName("crisgvera");
        user.setPassword(encoder.encode("102"));
        User returnedUser = userRepo.save(user);

        assertTrue(returnedUser.getPassword().equals(user.getPassword()));
    }

}

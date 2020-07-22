package com.fullstack.springsecurityjpatest.service;

import com.fullstack.springsecurityjpatest.model.MyUserDetailsImpl;
import com.fullstack.springsecurityjpatest.model.User;
import com.fullstack.springsecurityjpatest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        // This method create an instance of UserDetails to use in SecurityConfig.class
        Optional<User> user = userRepository.findByUserName(userName);

        // TODO: Study '...(() -> new...' notation (lambda function)
        // If user doesn't exist, method will throws an exception
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

        // TODO: Study 'map(MyUserDetailsImpl::new)' notation
        // If user exist, method will return that user
        return user.map(MyUserDetailsImpl::new).get();
    }
}

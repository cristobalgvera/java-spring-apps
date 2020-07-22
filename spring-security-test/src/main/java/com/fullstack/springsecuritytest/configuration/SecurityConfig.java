package com.fullstack.springsecuritytest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // Here we can set our configurations on the auth object
        auth.inMemoryAuthentication()
                .withUser("foo")
                .password("bar")
                .roles("USER")
                .and()
                .withUser("crisgvera")
                .password("12345")
                .roles("ADMIN");

        // Basically, above code makes an in memory authentication setting a static user, pass
        // and role
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Note when static content will be requested, authorization will be granted
        // The order to write permissions is from the less restricted to the most restricted
        http.authorizeRequests()
                .antMatchers("/admin").hasRole("ADMIN") // When a request match with the .antMatchers()
                // argument, Spring Security will control the role specified
                .antMatchers("/user").hasAnyRole("USER", "ADMIN") // .hasAnyRole() allows to define more than one role
                .antMatchers("/", "static/css", "static/js", "static/img").permitAll()
                .and().formLogin();
    }

    // ALWAYS DEAL WITH HASHED PASSWORDS!!
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        // This is a test object to use, don't use it in real applications
        return NoOpPasswordEncoder.getInstance();
    }
}

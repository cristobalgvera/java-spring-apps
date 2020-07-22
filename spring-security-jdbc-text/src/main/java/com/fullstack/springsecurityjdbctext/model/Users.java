package com.fullstack.springsecurityjdbctext.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

/*
    This database schema is the default recommended for Spring Security
 */

@Entity
public class Users {

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn // Tells Spring Boot this field is our join primary key
    private Authorities authority;

    @Id
    @Column(length = 50)
    private String username;

    @NotNull
    @Column(length = 50)
    private String password;

    private Boolean enabled;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Authorities getAuthority() {
        return authority;
    }

    public void setAuthority(Authorities username) {
        this.authority = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}

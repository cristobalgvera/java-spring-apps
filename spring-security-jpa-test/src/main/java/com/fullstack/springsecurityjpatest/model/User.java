package com.fullstack.springsecurityjpatest.model;

import javax.persistence.*;

@Entity
@Table(name = "USER_TABLE") // Note that 'user' is a reserved word to Oracle
public class User {
    @Id
    @GeneratedValue(generator = "USER_SEQ")
    private Long id;

    @Column(length = 30)
    private String userName;

    @Column(length = 30)
    private String password;

    private boolean active;

    // In DB, roles must be named like 'ROLE_ROLE-NAME', i.e: 'ROLE_ADMIN'
    private String roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", roles='" + roles + '\'' +
                '}';
    }
}

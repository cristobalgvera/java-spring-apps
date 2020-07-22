package com.fullstack.springsecurityjdbctext.model;

import javax.persistence.*;

@Entity
public class Authorities {

    @Id
    private String username;

    @MapsId // Tells Spring Boot this field will be a mapped foreign key (this case from Users)
    @OneToOne(mappedBy = "authority") // Tells Spring Boot where the foreign key is
    @JoinColumn(name = "username") // Must be named equals to @Id field on this class
    private Users user;

    @Column(length = 50)
    private String authority;

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

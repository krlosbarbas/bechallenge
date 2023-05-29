package com.api.bechallenge.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @Column(name="email", unique = true, nullable = false)
    private String email;

    @Column
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

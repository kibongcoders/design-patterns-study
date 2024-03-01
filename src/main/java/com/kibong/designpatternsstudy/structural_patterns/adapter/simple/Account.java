package com.kibong.designpatternsstudy.structural_patterns.adapter.simple;

import com.kibong.designpatternsstudy.structural_patterns.adapter.simple.security.UserDetails;

public class Account implements UserDetails {

    private String name;

    private String password;

    private String email;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

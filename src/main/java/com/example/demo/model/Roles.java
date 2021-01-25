package com.example.demo.model;

import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.GrantedAuthority;

public class Roles implements GrantedAuthority {
    String Role;

    public Roles() {
        Role = "ADMIN";
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    @Override
    public String getAuthority() {
        return "ADMIN";
    }
}

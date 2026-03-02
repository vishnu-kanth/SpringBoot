package com.lpu.springbootdto.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRequestDTO {

    @NotBlank(message = "Username required")
    private String username;

    @Email(message = "Invalid email")
    private String email;

    @Size(min = 6, message = "Password must be 6 characters")
    private String password;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
// File: src/main/java/com/example/demo/dto/LoginRequestDTO.java
package com.example.demo.dto;

public class LoginRequestDTO {
    private String email;
    //private String password;

    // Constructors
    public LoginRequestDTO() {}

    public LoginRequestDTO(String email) {
        this.email = email;
        //this.password = password;
    }

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }*/
}

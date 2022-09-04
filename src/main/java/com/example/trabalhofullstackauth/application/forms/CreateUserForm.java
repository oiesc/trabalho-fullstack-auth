package com.example.trabalhofullstackauth.application.forms;

import com.example.trabalhofullstackauth.application.models.UserModel;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class CreateUserForm {
    @NotEmpty(message = "Name cannot be null")
    private String name;
    @NotEmpty(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    private String email;
    @NotEmpty(message = "Password cannot be null")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public UserModel transform() {
        return new UserModel(this.name, this.email, this.password);
    }
}

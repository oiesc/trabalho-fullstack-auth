package com.example.trabalhofullstackauth.application.forms;

import com.example.trabalhofullstackauth.application.models.UserModel;

public class CreateUserForm {
    private String name;
    private String email;
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

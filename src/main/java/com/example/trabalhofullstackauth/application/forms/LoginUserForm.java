package com.example.trabalhofullstackauth.application.forms;

import com.example.trabalhofullstackauth.application.models.UserModel;

public class LoginUserForm {

    private String email;
    private String password;

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

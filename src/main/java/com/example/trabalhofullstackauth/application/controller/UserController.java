package com.example.trabalhofullstackauth.application.controller;

import com.example.trabalhofullstackauth.application.forms.CreateUserForm;
import com.example.trabalhofullstackauth.application.forms.LoginUserForm;
import com.example.trabalhofullstackauth.application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody CreateUserForm userForm) {
        return userService.createUser(userForm);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginUserForm loginForm) {
        return userService.login(loginForm);
    }
}

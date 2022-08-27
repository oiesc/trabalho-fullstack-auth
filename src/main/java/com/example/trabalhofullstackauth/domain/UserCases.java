package com.example.trabalhofullstackauth.domain;

import com.example.trabalhofullstackauth.application.dtos.UserDTO;
import com.example.trabalhofullstackauth.application.forms.CreateUserForm;
import com.example.trabalhofullstackauth.application.forms.LoginUserForm;
import com.example.trabalhofullstackauth.application.models.UserModel;
import com.example.trabalhofullstackauth.application.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Objects;
import java.util.Optional;

public class UserCases {
    @Autowired
    UserRepository userRepository;

    public ResponseEntity<?> createUser(CreateUserForm userForm) {
        UserModel user = userForm.transform();
        userRepository.save(user);
        return ResponseEntity.ok(user);
    }

    public ResponseEntity<?> login(LoginUserForm user) {
        String message = "Usuário ou senha inválidos!";
        Optional<UserModel> userModel = userRepository.findByEmail(user.getEmail());
        if (userModel.isPresent()) {
            UserDTO userFound = new UserDTO(userModel.get());
            return Objects.equals(userModel.get().getPassword(), user.getPassword()) ? ResponseEntity.ok(userFound) : ResponseEntity.badRequest().body(message);
        }
        return ResponseEntity.badRequest().body(message);
    }
}

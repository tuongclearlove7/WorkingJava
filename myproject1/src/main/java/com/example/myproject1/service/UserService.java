package com.example.myproject1.service;

import com.example.myproject1.dto.RegistrationDto;
import com.example.myproject1.models.UserEntity;

public interface UserService {

    void saveUser(RegistrationDto registrationDto);

    UserEntity findByEmail(String email);

    UserEntity findByUsername(String username);
}

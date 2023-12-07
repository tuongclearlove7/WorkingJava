package com.example.myproject1.service.impl;

import com.example.myproject1.dto.RegistrationDto;
import com.example.myproject1.models.Club;
import com.example.myproject1.models.Role;
import com.example.myproject1.models.UserEntity;
import com.example.myproject1.repository.RoleRepository;
import com.example.myproject1.repository.UserRepository;
import com.example.myproject1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

import static com.example.myproject1.mapper.ClubMapper.mapToClubDto;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }


    @Override
    public void saveUser(RegistrationDto registrationDto) {

        UserEntity user = new UserEntity();
        user.setUsername(registrationDto.getUsername());
        user.setEmail(registrationDto.getEmail());
        user.setPassword(registrationDto.getPassword());
        Role role = roleRepository.findByName("USER");
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }

    @Override
    public UserEntity findByEmail(String email) {

        return userRepository.findByEmail(email);
    }

    @Override
    public UserEntity findByUsername(String username) {

        return userRepository.findByUsername(username);
    }


}

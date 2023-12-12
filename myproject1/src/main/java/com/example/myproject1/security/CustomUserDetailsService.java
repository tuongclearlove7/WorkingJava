package com.example.myproject1.security;

import com.example.myproject1.models.UserEntity;
import com.example.myproject1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity user = userRepository.findFirstByUsername(username);

        if(user != null) {

            return new User(

                    user.getEmail(),
                    user.getPassword(),
                    user.getRoles()
                    .stream().map((role) -> new SimpleGrantedAuthority(role
                    .getName()))
                    .collect(Collectors.toList())
            );

        } else {

            throw new UsernameNotFoundException("Invalid username or password!");
        }
    }

}

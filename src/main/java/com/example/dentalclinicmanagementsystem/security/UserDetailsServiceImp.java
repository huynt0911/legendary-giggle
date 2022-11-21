package com.example.dentalclinicmanagementsystem.security;

import com.example.dentalclinicmanagementsystem.entity.User;
import com.example.dentalclinicmanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserNameAndAndEnable(username, Boolean.TRUE);
        if (user == null) {
            throw new RuntimeException("user not found");
        }

        return new UserDetailImpl(user);
    }
}

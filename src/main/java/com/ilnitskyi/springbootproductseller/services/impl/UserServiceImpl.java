package com.ilnitskyi.springbootproductseller.services.impl;

import com.ilnitskyi.springbootproductseller.model.Role;
import com.ilnitskyi.springbootproductseller.model.User;
import com.ilnitskyi.springbootproductseller.repository.UserRepository;
import com.ilnitskyi.springbootproductseller.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional
    public void changeRole(Role newRole, String username) {
        userRepository.updateUserRole(username, newRole);
    }
}

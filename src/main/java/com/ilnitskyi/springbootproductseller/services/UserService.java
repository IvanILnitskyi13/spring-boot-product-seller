package com.ilnitskyi.springbootproductseller.services;

import com.ilnitskyi.springbootproductseller.model.Role;
import com.ilnitskyi.springbootproductseller.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    Optional<User> findUserByUsername(String username);
    void changeRole(Role newRole, String username);
}

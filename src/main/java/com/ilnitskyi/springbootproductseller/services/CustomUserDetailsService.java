package com.ilnitskyi.springbootproductseller.services;

import com.ilnitskyi.springbootproductseller.model.Role;
import com.ilnitskyi.springbootproductseller.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface CustomUserDetailsService {
    UserDetailsService getUserDetailsService();
}

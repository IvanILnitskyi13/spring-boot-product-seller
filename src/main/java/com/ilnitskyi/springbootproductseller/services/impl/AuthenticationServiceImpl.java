package com.ilnitskyi.springbootproductseller.services.impl;

import com.ilnitskyi.springbootproductseller.dao.request.SignInRequest;
import com.ilnitskyi.springbootproductseller.dao.request.SignUpRequest;
import com.ilnitskyi.springbootproductseller.dao.response.JwtAuthenticationResponse;
import com.ilnitskyi.springbootproductseller.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final AuthenticationManager authenticationManager;
    @Override
    public JwtAuthenticationResponse signUp(SignUpRequest request) {
        return null;
    }

    @Override
    public JwtAuthenticationResponse signIn(SignInRequest request) {
        return null;
    }
}

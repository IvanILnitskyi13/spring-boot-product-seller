package com.ilnitskyi.springbootproductseller.services;

import com.ilnitskyi.springbootproductseller.dao.request.SignInRequest;
import com.ilnitskyi.springbootproductseller.dao.request.SignUpRequest;
import com.ilnitskyi.springbootproductseller.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signUp(SignUpRequest request);
    JwtAuthenticationResponse signIn(SignInRequest request);
}

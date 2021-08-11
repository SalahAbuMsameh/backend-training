package com.example.demo.auth;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * Note: to be used for a custom s
 * Aug 11, 2021
 * @author Salah Abu Msameh
 */
public class CustomAuthProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		//load user and validate password
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		//post checks
		return false;
	}

}

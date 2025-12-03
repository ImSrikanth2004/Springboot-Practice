package com.web.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
	public boolean Authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("Srikanth");
		boolean isValidPassword = password.equalsIgnoreCase("Login");
		return isValidUserName && isValidPassword;
	}
}


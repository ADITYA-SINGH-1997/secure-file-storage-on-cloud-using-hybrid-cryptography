package com.aditya.login;


public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("123") && password.equals("123");
	}

}
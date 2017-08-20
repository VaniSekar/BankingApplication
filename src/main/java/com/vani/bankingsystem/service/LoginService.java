package com.vani.bankingsystem.service;

import com.vani.bankingsystem.dao.LoginDAO;
import com.vani.bankingsystem.entity.User;

public class LoginService {
	public boolean authenticate(User userInput) {
		LoginDAO loginServiceDao = new LoginDAO();
		User user = loginServiceDao.performLogin(userInput);
		
		if(user!=null && userInput.getUserPassword().equalsIgnoreCase(user.getUserPassword())) {
			return true;
		}else {
			return false;
		}
	}
	
}

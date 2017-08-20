package com.vani.bankingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vani.bankingsystem.entity.User;
import com.vani.bankingsystem.service.LoginService;

@Controller
@RequestMapping("/bank")
public class LoginController {

	@RequestMapping("/bankLogin")
	public String showLogin(Model model) {
		model.addAttribute("user", new User());
		return "bankLogin";
	}

	@RequestMapping("/loginHome")
	public String showBankHome(@ModelAttribute("user") User user,Model model) {
		LoginService loginService = new LoginService();

		if (loginService.authenticate(user)) {
			return "bankHome";
		} else {
			model.addAttribute("errorMessage","Invalid Username/Password");
			return "bankLogin";
		}
	}

}

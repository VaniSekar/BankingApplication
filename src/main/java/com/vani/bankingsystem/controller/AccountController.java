package com.vani.bankingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vani.bankingsystem.entity.Account;

@Controller
@RequestMapping("/create")
public class AccountController {
	@RequestMapping("/addAccount")
	public String addAccount(@ModelAttribute("account") Account account) {
		//model.addAttribute();
		return("accountadded");
		
	}

}

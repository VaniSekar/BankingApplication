package com.vani.bankingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vani.bankingsystem.entity.CreditCard;

@Controller
@RequestMapping("/authorize")
public class AuthorizeTransactionController {

	@RequestMapping("/authorizeTransaction")
	public String authorizeAccount(@ModelAttribute("creditCard") CreditCard creditCard) {
		// model.addAttribute();
		return ("authorizationSuccess");

	}

}

package com.vani.bankingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vani.bankingsystem.dto.AccountDisplayDTO;
import com.vani.bankingsystem.entity.Account;
import com.vani.bankingsystem.entity.CreditCard;
import com.vani.bankingsystem.entity.Transaction;

@Controller
@RequestMapping("/home")
public class HomeController {
	@RequestMapping("/createAccount")
	public String createAccount(Model model) {
		model.addAttribute("account",new Account());
		return "createAccount";
	}
	
	@RequestMapping("/transaction")
	public String performTransaction(Model model) {
		model.addAttribute("transaction",new Transaction());
		return "transaction";
	}
	@RequestMapping("/displayAccount")
	public String displayTransaction(Model model) {
		model.addAttribute("accountDisplayDTO",new AccountDisplayDTO());
		return "displayAccount";
	}
	@RequestMapping("/authorizeTransaction")
	public String authorizeTransaction(Model model) {
		model.addAttribute("creditCard",new CreditCard());
		return "authorizeTransaction";
	}
	

}

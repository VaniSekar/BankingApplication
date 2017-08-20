package com.vani.bankingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vani.bankingsystem.entity.Transaction;
import com.vani.bankingsystem.service.TransactionService;
@Controller
@RequestMapping("/transact")
public class TransactionController {
	
	TransactionService txService = new TransactionService();
	
	@RequestMapping("/transactAccount")
	public String addAccount(@ModelAttribute("transaction") Transaction transaction) {
		//model.addAttribute();
		System.out.println("the account number  :"+transaction.getAccount().getNumber());
		//transaction.getAccount().setBalAmount(5000);
		txService.performTransaction(transaction);
		
		
		if(transaction.getTransactionType().equalsIgnoreCase("Credit")) {
			
			//transaction.getAccount().setBalAmount(transaction.getAccount().getBalAmount()+transaction.getTransactionAmount());
			return("accountCredited");
		}
		
		else
		{
			//transaction.getAccount().setBalAmount(transaction.getAccount().getBalAmount()-transaction.getTransactionAmount());
			return("accountDebited");
		}
	}

}

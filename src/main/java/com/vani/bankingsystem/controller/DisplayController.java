package com.vani.bankingsystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vani.bankingsystem.dto.AccountDisplayDTO;
import com.vani.bankingsystem.entity.Transaction;

@Controller
@RequestMapping("/display")
public class DisplayController {
	@RequestMapping("/displayAccount")
	public String addAccount(@ModelAttribute("accountDisplayDTO") AccountDisplayDTO accountDisplayDTO) {
		// model.addAttribute();
		System.out.println("*****************************************   Inside addAccount *************************");
		System.out.println("The from date"+accountDisplayDTO.getFromDate());
		Transaction transaction = new Transaction();
		transaction.setTransactionId(123);
		transaction.setTransactionDesc("transfer to friend");;
		List<Transaction> transactions = new ArrayList<>();
		transactions.add(transaction);
		accountDisplayDTO.setTransactions(transactions);
		return ("displayAccountFinished");

	}

}
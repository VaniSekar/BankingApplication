package com.vani.bankingsystem.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.vani.bankingsystem.entity.Transaction;

public class AccountDisplayDTO {

	@DateTimeFormat(pattern = "dd/MM/yyyy")		
	private LocalDate fromDate; 
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate toDate;
	private int accountNumber;
	private List<Transaction> transactions;
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
		
}

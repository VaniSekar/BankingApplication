package com.vani.bankingsystem.entity;

import java.time.LocalDate;
import java.util.LinkedHashMap;

public class Transaction {

	private int transactionId;
	private int transactionAmount;
	private String transactionType;
	private LocalDate transactionDate;
	// private String fromDate;
	// private String toDate;
	private String transactionDesc;
	private Account account;
	
	private LinkedHashMap<String, String> transactTypeOptions;
	public Transaction() {
		transactTypeOptions = new LinkedHashMap<String, String>();
		transactTypeOptions.put("Credit", "Credit");
		transactTypeOptions.put("Debit", "Debit");
	}
	public int getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionDesc() {
		return transactionDesc;
	}
	public void setTransactionDesc(String transactionDesc) {
		this.transactionDesc = transactionDesc;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public LinkedHashMap<String, String> getTransactTypeOptions() {
		return transactTypeOptions;
	}
	public void setTransactTypeOptions(LinkedHashMap<String, String> transactTypeOptions) {
		this.transactTypeOptions = transactTypeOptions;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
	
}

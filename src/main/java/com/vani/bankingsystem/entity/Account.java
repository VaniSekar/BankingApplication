package com.vani.bankingsystem.entity;

import java.time.LocalDate;
import java.util.LinkedHashMap;

public class Account {
	
	public Account() {
		typeOptions = new LinkedHashMap<String,String>();
		typeOptions.put("Saving", "Saving");
		typeOptions.put("Checking", "Checking");
		typeOptions.put("Current", "Current");
		
	}
	private int number;
	private String accountType;
	private int balAmount;
	private LinkedHashMap<String,String> typeOptions;
	private User user;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalAmount() {
		return balAmount;
	}
	public void setBalAmount(int balAmount) {
		this.balAmount = balAmount;
	}
	public LinkedHashMap<String, String> getTypeOptions() {
		return typeOptions;
	}
	public void setTypeOptions(LinkedHashMap<String, String> typeOptions) {
		this.typeOptions = typeOptions;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
	
	
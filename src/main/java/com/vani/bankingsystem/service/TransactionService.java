package com.vani.bankingsystem.service;

import com.vani.bankingsystem.dao.TransactionDAO;
import com.vani.bankingsystem.entity.Transaction;

public class TransactionService {
	public void performTransaction(Transaction tx) {
		TransactionDAO txDao = new TransactionDAO();
		txDao.insertTransaction(tx);
	}
}

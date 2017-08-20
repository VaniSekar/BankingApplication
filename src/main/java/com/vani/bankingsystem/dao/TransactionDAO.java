package com.vani.bankingsystem.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vani.bankingsystem.entity.User;

public class TransactionDAO {

	
	public void insertTransaction(com.vani.bankingsystem.entity.Transaction tx) {
		
	Configuration config = null;
	SessionFactory factory = null;
	Session session = null;
	Transaction transaction = null;
	try {
		config = new Configuration();
		config.configure();
		factory = config.buildSessionFactory();
		session = factory.openSession();
		transaction = session.beginTransaction();
		session.save(tx);
		transaction.commit();
		
	}catch(Exception e) {
		System.out.println("Exception"+e);
	}finally {
		session.close();
		factory.close();
	}
}
}

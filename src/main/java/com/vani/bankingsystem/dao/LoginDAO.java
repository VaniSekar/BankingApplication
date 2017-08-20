package com.vani.bankingsystem.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vani.bankingsystem.entity.User;


public class LoginDAO {
	
	public User performLogin(User inputUser) {
	
	Configuration config = null;
	SessionFactory factory = null;
	Session session = null;
	Transaction transaction = null;
	User user = null;
	try {
		config = new Configuration();
		config.configure();
		factory = config.buildSessionFactory();
		session = factory.openSession();
		transaction = session.beginTransaction();
		//session.save(inputUser);
		
		 user = session.get(User.class,inputUser.getUserId());
		
		transaction.commit();
		
	}catch(Exception e) {
		System.out.println("Exception"+e);
	}finally {
		session.close();
		factory.close();
	}
	
	return user;
	}

}

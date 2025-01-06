package com.kiran.BankApplication;

public class Customer 
{
	private String name; 
	private BankAccount account;
	
	public Customer(String name, BankAccount account) {
		super();
		this.name = name;
		this.account = account;
	}

	

	public BankAccount getAccount() {
		return account;
	}

	
	
	
	
}

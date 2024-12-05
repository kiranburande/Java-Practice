package com.kiran.BankingAccountManagementSystem;

public class Account 
{
	String accountNumber;  
	double balance;
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	} 
	
	public Account generateStatement()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
		return new Account(accountNumber,balance);
	}

}

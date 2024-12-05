package com.kiran.BankingAccountManagementSystem;

public class SavingsAccount extends Account
{
	double interestRate;

	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	@Override
	public SavingsAccount generateStatement() 
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Current Balance: "+balance);
		System.out.println("Interest Rate: "+interestRate); 
		return new SavingsAccount(accountNumber,balance,interestRate);
	}
	

}

package com.kiran.BankingAccountManagementSystem;

public class CheckingAccount extends Account
{
	double overdraftLimit;

	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public CheckingAccount generateStatement() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Current Balance: "+balance);
		System.out.println("Overdraft Limit: "+overdraftLimit); 
		return new CheckingAccount(accountNumber,balance,overdraftLimit);
	}

	 
	

}

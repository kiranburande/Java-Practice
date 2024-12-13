package com.kiran.BankingSystemwithLooselyCoupledArchitecture;

public class ICICI implements Bank 
{
	Customer cust;

	public ICICI(Customer cust) {
		super();
		this.cust = cust;
	}

	@Override
	public void deposit(double amount) 
	{
		cust.accountBalance += amount;
	    System.out.println("Money Deposited Successfully...");
	}

	@Override
	public void withdraw(double amount) 
	{
		cust.accountBalance -= amount;
		System.out.println("Withdrawal Successful...");
		
	}

	@Override
	public double checkBalance() 
	{
		return cust.accountBalance;
	}
}

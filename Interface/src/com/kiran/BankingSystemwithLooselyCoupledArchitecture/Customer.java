package com.kiran.BankingSystemwithLooselyCoupledArchitecture;

public class Customer 
{
	String name;
	double accountBalance;
	
	public void deposit(Bank bank, double amount)
	{
		bank.deposit(amount);
	}
	
	public void withdraw(Bank bank, double amount)
	{
		bank.withdraw(amount);
	}
	
	public void checkBalance(Bank bank)
	{
		System.out.println(bank.checkBalance());
	}

}

package com.kiran.simplebankingsystem;

public class BankAccount 
{
	int accountNumber;
	double balance;
	
	public BankAccount(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	void deposit(double amount)
	{
		if(amount <= 0)
		{
			System.out.println("Invalid Amount.");
		}
		else 
		{
			balance += amount;
			System.out.println("Diposit Success...");
			System.out.println("Your updated balance is :"+balance);
		}
		
	}
	
	void withdraw(double amount)
	{
		if(amount > balance)
		{
			System.out.println("Insufficient funds.");
		}
		else if(amount <= 0)
		{
			System.out.println("Invaid Amount.");
		}
		else {
			balance-=amount;
			System.out.println("Withdrawal Success...");
			System.out.println("Your updated balance is :"+balance);
		}
	}

}

class SavingAccount extends BankAccount 
{
	double interestRate;

	public SavingAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	void addInterest()
	{
		balance += (balance*interestRate/100);
		
		System.out.println("Interest Added Successfully...");
		System.out.println("Your updated balance is :"+balance);
	}
	
}
 
class CheckingAccount extends BankAccount
{
	double overdraftLimit ;

	public CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	void withdraw(double amount)
	{
		if(amount > overdraftLimit)
		{
			System.out.println("Exceeds overdraft limit.");
		}
		else if(amount <= 0 || amount > balance)
		{
			System.out.println("Invalid Amount.");
		}
		else
		{
			balance -=amount;
			System.out.println("Withdrawal Success...");
			System.out.println("Your updated balance is :"+balance);
		}
		
	}
	
}







package com.kiran.simplebankingsystem;

public class MainBankAccount 
{
	public static void main(String[] args) 
	{
		SavingAccount savingAccount = new SavingAccount(123456,2000,8.5);
		CheckingAccount checkingAccount = new CheckingAccount(123455,20000,3000);
		
		savingAccount.deposit(4000);
		savingAccount.withdraw(2000);
		savingAccount.addInterest();
		
		System.out.println();
		
		checkingAccount.deposit(3000);
		checkingAccount.withdraw(2000);
		
		
		
	}

}

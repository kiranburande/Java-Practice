package com.kiran.BankingSystemwithLooselyCoupledArchitecture;

public interface Bank 
{
	void deposit(double amount); 
	void withdraw(double amount); 
	double checkBalance();

}

package com.kiran.BankApplication;

public class AccountNotFoundException extends Exception
{

	public AccountNotFoundException(String errorMessage) 
	{
		super(errorMessage);
	}
	
}

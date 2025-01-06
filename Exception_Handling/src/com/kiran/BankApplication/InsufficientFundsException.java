package com.kiran.BankApplication;

class InsufficientFundsException extends Exception
{

	public InsufficientFundsException(String errorMessage) 
	{
		super(errorMessage);
	}
	
}

package com.kiran.BankApplication;

class InvalidAmountException extends RuntimeException
{

	public InvalidAmountException(String errorMessage) 
	{
		super(errorMessage);
	}
	
}

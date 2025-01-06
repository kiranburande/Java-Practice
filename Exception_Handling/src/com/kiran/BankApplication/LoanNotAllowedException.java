package com.kiran.BankApplication;

public class LoanNotAllowedException extends RuntimeException
{
	public LoanNotAllowedException(String errorMessage) 
	{
		super(errorMessage);
	}
}

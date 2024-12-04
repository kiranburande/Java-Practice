package com.kiran.bankingsystem;

public class CreditCardPayment extends Payment 
{

	@Override
	public void processPayment() {
		 
		super.processPayment();
		System.out.println("Credit Card  payment done.");
	}
	

}

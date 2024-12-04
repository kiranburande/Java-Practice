package com.kiran.bankingsystem;

public class PayPalPayment extends Payment 
{

	@Override
	public void processPayment() {
		 
		super.processPayment();
		System.out.println("PayPal  payment done.");
	}
	

}

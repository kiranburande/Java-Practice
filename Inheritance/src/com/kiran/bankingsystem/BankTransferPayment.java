package com.kiran.bankingsystem;

public class BankTransferPayment extends Payment
{

	@Override
	public void processPayment() {
		 
		super.processPayment();
		System.out.println("bank transfer payment done.");
	}
	

}

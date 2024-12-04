package com.kiran.bankingsystem;

public class PaymentMain {

	public static void main(String[] args) 
	{
		Payment payment = new Payment();
		CreditCardPayment creditCardPayment = new CreditCardPayment();
		PayPalPayment payPalPayment = new PayPalPayment();
		BankTransferPayment bankTransferPayment = new BankTransferPayment();
		
		processMultiplePayments(payment,creditCardPayment,payPalPayment,bankTransferPayment);

	}
	
	public static void processMultiplePayments(Payment... payments)
	{
		for(Payment payment : payments)
		{
			 payment.processPayment();
		}
	}

}

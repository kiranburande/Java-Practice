package com.kiran.MobilePhoneSIMCardInteraction;

public class Airtel implements SIMCardInterface {

	@Override
	public void getPhoneNumber() 
	{
		System.out.println("Phone Number : 8888999900");

	}

	@Override
	public void networkProvider() 
	{
		System.out.print("Network Provider : ");

	}

	@Override
	public void activationDeactivation() 
	{
		System.out.println("Activation Status : Active");

	}

}

package com.kiran.MobilePhoneSIMCardInteraction;

public class MobilePhone implements MobilePhoneInterface {

	@Override
	public void insertSim(SIMCardInterface s) 
	{
		
		s.networkProvider();System.out.println(s.getClass().getSimpleName());
		s.getPhoneNumber();
		s.activationDeactivation();
	}

	@Override
	public void removeSim(SIMCardInterface s) 
	{
		System.out.println(s.getClass().getSimpleName() +" Sim Card is removed.");

	}

	@Override
	public void makeCall(SIMCardInterface s) 
	{
		System.out.println("From "+s.getClass().getSimpleName()+" Sim Making Calls");

	}

	@Override
	public void sendTextMsg(SIMCardInterface s) 
	{
		System.out.println("From "+s.getClass().getSimpleName()+" Sim Sending Text Message");

	}

}

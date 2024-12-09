package com.kiran.defensesystem;

public class PrecisionAirstrike extends Airstrike
{
	

	public PrecisionAirstrike(String name, String missionDetails) {
		super(name, missionDetails);
	}

	@Override
	public Airstrike getAirstrikePlan() 
	{
		 System.out.println("Generating a precision airstrike plan...");
		 System.out.println("Targeting coordinates locked. Minimum collateral damage ensured.");
		return new PrecisionAirstrike(name,missionDetails);
	}

	
	

}

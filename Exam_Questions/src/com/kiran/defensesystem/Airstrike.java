package com.kiran.defensesystem;

public class Airstrike 
{
	String name;
	String missionDetails;
	public Airstrike(String name, String missionDetails) {
		super();
		this.name = name;
		this.missionDetails = missionDetails;
	}
	
	public Airstrike getAirstrikePlan()
	{
		System.out.println("Generating a generic airstrike plan...");
		return new Airstrike(name,missionDetails);
	}

	  

}

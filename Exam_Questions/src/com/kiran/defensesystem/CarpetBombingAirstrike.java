package com.kiran.defensesystem;

public class CarpetBombingAirstrike extends Airstrike
{

	public CarpetBombingAirstrike(String name, String missionDetails) {
		super(name, missionDetails);
	}

	@Override
	public Airstrike getAirstrikePlan() {
		
		System.out.println("Generating a carpet bombing airstrike plan..."); 
		System.out.println("All coordinates in a 5km radius will be bombed for maximum impact.");
		return  new CarpetBombingAirstrike(name,missionDetails);
	}

	
	

}

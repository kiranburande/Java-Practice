package com.kiran.defensesystem;

public class DefenseSystem {

	public static void main(String[] args) 
	{
		Airstrike airstrike = new Airstrike("XYZ name","abc Mission");
		PrecisionAirstrike precisionAirstrike = new PrecisionAirstrike("XYZ name","abc Mission");
		CarpetBombingAirstrike CarpetBombingAirstrike = new CarpetBombingAirstrike("XYZ name","abc Mission");
		
		airstrike.getAirstrikePlan();
		precisionAirstrike.getAirstrikePlan();
		CarpetBombingAirstrike.getAirstrikePlan();

	}

}
 
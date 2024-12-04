package com.kiran.HospitalManagementSystem;

public class HospitalManagementSystem {

	public static void main(String[] args) 
	{
		Doctor doctor = new Doctor("Dr.Pravin",24,"Doctor","Neurologist");
		Nurse nurse = new Nurse("Sakshi",21,"Nurse",3);
		
		doctor.work();
		nurse.work();

	}

}

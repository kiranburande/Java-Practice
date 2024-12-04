package com.kiran.HospitalManagementSystem;

public class Nurse extends HospitalStaff
{
	private int yearsOfExperience;
	 

	public Nurse(String name, int age, String role, int yearsOfExperience) {
		super(name, age, role);
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public void work() 
	{
		super.work();
		System.out.println(role + " " + name + " with " + yearsOfExperience + " years of experience is taking care of patients.");
	}

	 
	

}

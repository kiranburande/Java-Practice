package com.kiran.HospitalManagementSystem;

public class HospitalStaff 
{
	protected String name;
	protected int age;
	protected String role;
	
	public HospitalStaff(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}
	
	public void work()
	{
		System.out.println(name+" is working.");
		System.out.println("Age :"+age);
		System.out.println("Role :"+role);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getRole() {
		return role;
	}
	

}

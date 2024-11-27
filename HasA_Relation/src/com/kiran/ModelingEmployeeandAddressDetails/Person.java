package com.kiran.ModelingEmployeeandAddressDetails;

public class Person 
{
	private String name;
	private Address address;
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	void displayInfo()
	{
		System.out.print("Address [Name :"+name+"] ");
		System.out.println(address);
	}

}

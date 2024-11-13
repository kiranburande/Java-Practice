package com.kiran.Day5;

public class Vehicle1 {
	String make;
	String model;
	int year;
	public Vehicle1(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displayDetails()
	{
		if(this.year <= 0)
		{
			System.out.println("Error invalid Input");
		}
		else
		{
			System.out.println("Make :"+make);
			System.out.println("Model :"+model);
			System.out.println("Year :"+year);
		}
		
	}

}

class Car2 extends Vehicle1
{
	int numberOfDoors;

	public Car2(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		if(this.numberOfDoors <= 0)
		{
			System.out.println("Error Invalid Input");
		}
		else {
			System.out.println("Number of Doors :"+numberOfDoors);
		}
		
	}
	
	
}

class Bike2 extends Vehicle1
{
	String type;

	public Bike2(String make, String model, int year, String type) {
		super(make, model, year);
		this.type = type;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("Type :"+type);
	}
	
	
}





package com.kiran.CoronaDoseBookingSystem;

import java.util.Scanner;

class VaccineEligibility 
{
	private int age;
	private boolean hasHealthCondition;
	
	public VaccineEligibility(int age, boolean hasHealthCondition) 
	{
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	
	public boolean isEligible()
	{
		if(age >= 18 && age <=60)
		{
			return true;
		}
		else {
			return false;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHasHealthCondition() {
		return hasHealthCondition;
	}

	public void setHasHealthCondition(boolean hasHealthCondition) {
		this.hasHealthCondition = hasHealthCondition;
	}
	
	
}

class DoseBooking 
{
	private boolean booked;
	
	public boolean bookDose()
	{
		try {
			if(booked == true)
			{
				throw new RuntimeException("Dose already booked.");
			}
			else
			{
				booked = true;				
			}
			
		}
		catch(RuntimeException e)
		{
			System.err.println(e.getMessage());
		}
		return booked;
	}
	
	public boolean isDoseBooked()
	{
		return this.booked;
	}
}


class User 
{
	private String name;
	private VaccineEligibility eligibility;
    private DoseBooking doseBooking;
    
	public User(String name, VaccineEligibility eligibility, DoseBooking doseBooking) {
		super();
		this.name = name;
		this.eligibility = eligibility;
		this.doseBooking = doseBooking;
	}
	
	public void isEligible()
	{
		if(eligibility.isEligible())
		{
			System.out.println("You are eligible for the vaccine");
		}
		
		else System.out.println("You are not eligible for the vaccine");
	}
	
	public void bookDose()
	{
		if(doseBooking.bookDose())
		{
			System.out.println("Dose Booked Successfully.");
		}
	}
	
	public void isDoseBooked()
	{
		if(doseBooking.isDoseBooked())
		{
			System.out.println("Dose is booked");
		}
		
		else System.out.println("Dose is not booked");
	}
    
}

public class CoronaVaccineApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name :");
		String name = sc.nextLine();
		System.out.println("Enter your Age :");
		int age=sc.nextInt();
		System.out.println("Enter Health condition :");
		boolean hc = sc.nextBoolean();
		
		VaccineEligibility vaccineEligibility = new VaccineEligibility(age, hc);
		DoseBooking doseBooking = new DoseBooking();
		User user = new User(name, vaccineEligibility, doseBooking);
		
		user.isEligible();
		user.isDoseBooked();
		user.bookDose();
		user.isDoseBooked();
	}
}

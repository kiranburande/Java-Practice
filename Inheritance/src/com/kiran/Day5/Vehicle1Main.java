package com.kiran.Day5;

public class Vehicle1Main 
{
	public static void main(String[] args) 
	{
		Car2 c2 = new Car2("Audi", "Q8", 2021, 4);
		 System.out.println("Car Details:");
         c2.displayDetails();
		
		Bike2 b2 = new Bike2("Yamaha", "MT-07", 2020, "Sports");
		System.out.println("\nBike Details:");
        b2.displayDetails();
		
	}

}

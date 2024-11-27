package com.kiran.ChangeTheDriver;

public class CarMain {

	public static void main(String[] args) 
	{
		Driver driver1 = new Driver("John", 30);
		CarBLC c1 = new CarBLC("Hyundai", "Creta", 2020, driver1);
		CarBLC c2 = new CarBLC(c1);
		
		System.out.println("Original Car Details:");
		System.out.println("Car Brand : "+c1.getBrand());
		System.out.println("Car Model : "+c1.getModel());
		System.out.println("Car Year : "+c1.getYear());
        System.out.println("Driver Name : "+c1.getDriver().getName());
        System.out.println("Driver Age : "+c1.getDriver().getAge());
        System.out.println();
        
        System.out.println(" Copied Car Details:");
        System.out.println("Car Brand : "+c2.getBrand());
		System.out.println("Car Model : "+c2.getModel());
		System.out.println("Car Year : "+c2.getYear());
        System.out.println("Driver Name : "+c2.getDriver().getName());
        System.out.println("Driver Age : "+c2.getDriver().getAge());
        System.out.println();
        
        Driver driver2 = new Driver("Logan", 35);
        c1.setDriver(driver2);
        
        System.out.println("Original Car Details after Changing Driver:");
		System.out.println("Car Brand : "+c1.getBrand());
		System.out.println("Car Model : "+c1.getModel());
		System.out.println("Car Year : "+c1.getYear());
        System.out.println("Driver Name : "+c1.getDriver().getName());
        System.out.println("Driver Age : "+c1.getDriver().getAge());
        System.out.println();
        
        System.out.println(" Copied Car Details after Changing Driver in Original Car::");
        System.out.println("Car Brand : "+c2.getBrand());
		System.out.println("Car Model : "+c2.getModel());
		System.out.println("Car Year : "+c2.getYear());
        System.out.println("Driver Name : "+c2.getDriver().getName());
        System.out.println("Driver Age : "+c2.getDriver().getAge());
             
	}

}

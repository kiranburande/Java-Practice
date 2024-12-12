package com.kiran.abstract_demo2;

abstract class Car
{
	String brand;
	String model;
	int mileage ; 
	int top_speed;
	int yearOfManufacturing;
	
	public Car() {
		super();
	}

	public String carBrand(String brand) 
	{
		this.brand = brand;
		return this.brand;
	}
	 
	public String carModel(String model) 
	{
		 this.model=model;
		 return this.model;
		
	}
	public int carMileage(int mileage) 
	{
		this.mileage = mileage;
		return this.mileage;
	}
 
	public int carTopSpeed(int top_speed) 
	{
		this.top_speed = top_speed;
		return this.top_speed;
	}
	
	public int carYear(int yearOfManufacturing)
	{
		this.yearOfManufacturing = yearOfManufacturing;
		return this.yearOfManufacturing;
	}
	
	abstract void display();
}

public class Test extends Car
{
	

	@Override
	void display() 
	{
		 System.out.println("Brand : "+super.brand);
		 System.out.println("Model : "+super.model);
		 System.out.println("Mileage : "+super.mileage);
		 System.out.println("Top Speed : "+super.top_speed);
		System.out.println("Car Year : "+super.yearOfManufacturing);
	}
	
	 public static void main(String[] args) 
	 {
		 Test t = new Test();
		 t.carBrand("Maruti Suzuki");
		 t.carModel("Ertiga");
		 t.carMileage(23);
		 t.carTopSpeed(180);
		 t.carYear(2023);
		 t.display();
		
	 }
	

}

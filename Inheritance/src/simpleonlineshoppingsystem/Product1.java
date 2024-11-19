package com.kiran.simpleonlineshoppingsystem;

public class Product1 
{
	protected String name;
	protected double price;
	
	public Product1(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public void displayInfo()
	{
		System.out.println("Name :"+name);
		System.out.println("Price :"+price);
	}
	public int calculateTotalCost(int quantity)
	{
		return (int)price*quantity;
	}

}

class Electronics1 extends Product1
{
	private String brand;

	public Electronics1(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println("Brand :"+brand);
	}
	
	
}

class Clothing1 extends Product1
{
	private String size;

	public Clothing1(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println("Size :"+size);
	}
	
	
	
}







package com.kiran.onlineshoppingsystem;

public class Product 
{
	private String name;
	private double price;
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void displayInfo()
	{
		System.out.println("Name :"+name);
		System.out.println("Price :$"+price);
	}
	
	public int calculateTotalCost(int quantity)
	{
		return (int)(price)*quantity;
	}

}

class Electronics extends Product
{
	private String brand;

	public Electronics(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}
	
//	public void displayInfo()
//	{
//		 
//		System.out.println("Brand :"+brand);
//	}

	@Override
	public void displayInfo() {
		 
		super.displayInfo();
		System.out.println("Brand :"+brand);
	}

	@Override
	public String toString() {
		return "Electronics [brand=" + brand + "]";
	}

	 
	 
}

class Clothing extends Product
{
	private String size;

	public Clothing(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}
	
//	public void displayInfo()
//	{
//		System.out.println("Size :"+size);
//	}

	@Override
	public void displayInfo() {
		 
		super.displayInfo();
		System.out.println("Size :"+size);
	}

	@Override
	public String toString() {
		return "Clothing [size=" + size + "]";
	}

	 
	
	
}










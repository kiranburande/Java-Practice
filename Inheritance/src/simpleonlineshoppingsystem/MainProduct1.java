package com.kiran.simpleonlineshoppingsystem;

public class MainProduct1 
{
	public static void main(String[] args) 
	{
		Electronics1 electronics1 = new Electronics1("Laptop",40000,"Dell");
		Clothing1 clothing1 = new Clothing1("Shirt",2000,"Adidas");
		
		electronics1.displayInfo();
		System.out.println("Total Cost is :"+electronics1.calculateTotalCost(2));
		
		System.out.println();
		clothing1.displayInfo();
		System.out.println("Total Cost is :"+clothing1.calculateTotalCost(3));
	}

}

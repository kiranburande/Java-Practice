package com.kiran.onlineshoppingsystem;

public class OnlineShopping {

	public static void main(String[] args) 
	{
		int unit = 2;
		int unit1 = 3;
		Electronics electronics = new Electronics("Laptop",1200,"Dell");
		
		Clothing clothing = new Clothing("T-Shirt",25.00,"medium");
		
		System.out.println("Electronics Product:");
		electronics.displayInfo();
		System.out.println("Total cost for "+unit+" units: $"+electronics.calculateTotalCost(unit));
		System.out.println(electronics.toString());
		
		System.out.println();
		
		System.out.println("Clothing Product:");
		clothing.displayInfo();
		System.out.println("Total cost for "+unit1+" units: $"+ clothing.calculateTotalCost(unit1));
 		System.out.println(clothing.toString());
	

	}

}

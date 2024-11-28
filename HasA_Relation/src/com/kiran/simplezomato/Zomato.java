package com.kiran.simplezomato;

public class Zomato 
{
	public static void main(String[] args) 
	{
		Order order = new Order(56783,"Sport Shoes",1800);
		Customer customer = new Customer(123456,"Kiran Burande","Ameerpet, Hyderabad",order);
		
		System.out.println(customer);
		
	}
}


/* Program: 2
-----------
Create a class Order (Business Logic Class)
Instance Variables: 
   private int orderId;
   private String itemName;
   private double itemPrice;
Create a parameterized constructor initialize the instance variable of the class.
Override toString() from Object class to print Order class properties.

Create a class Customer (Business Logic Class)
Instance Variables: 
   private int customerId;
   private String customerName;
   private String customerAddress;
   private Order order; //HAS-A relation
Create a parameterized constructor initialize the instance variable of the class.
Override toString() from Object class to print Customer class properties.

Create a class Zomato (Executable Logic Class) which contains main method to print Customer class properties using toString() method.  */
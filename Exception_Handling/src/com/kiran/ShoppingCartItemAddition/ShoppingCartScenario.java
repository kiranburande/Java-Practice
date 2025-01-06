package com.kiran.ShoppingCartItemAddition;

class InvalidItemException extends Exception
{
	public InvalidItemException(String errorMessage) 
	{
		super(errorMessage);
	}
}

class OutOfStockException extends RuntimeException
{
	public OutOfStockException(String errorMessage) 
	{
		super(errorMessage);
	}
	
}

class ShoppingCart 
{
	private int availableItems;

	public ShoppingCart(int availableItems) {
		super();
		this.availableItems = availableItems;
	}
	
	public void addItem(int quantity)
	{
		try {
			if(quantity <= 0)
			{
				throw new InvalidItemException("Quantity Cannot be zero or negative");
			}
			else if(quantity > availableItems)
			{
				throw new OutOfStockException("Insufficient Stock");
			}
			availableItems -= quantity;
			System.out.println(quantity+" Items Successfuly Added to Cart");
		}
		catch(InvalidItemException e)
		{
			System.out.println(e.getMessage());
		}
		catch(OutOfStockException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void addItemUnchecked(int quantity)
	{
		try {
			if (quantity <= 0) {
	            throw new IllegalArgumentException("Quantity cannot be zero or negative");
	        }
			else if(quantity > availableItems)
			{
				throw new OutOfStockException("Insufficient Stock");
			}
			availableItems -= quantity;
			System.out.println(quantity+" Items Successfully Added to Cart");
		}
		catch(OutOfStockException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}

public class ShoppingCartScenario 
{
	public static void main(String[] args) 
	{
		ShoppingCart shoppingCart = new ShoppingCart(50);
		//
		shoppingCart.addItem(0);
		shoppingCart.addItem(-23);
		shoppingCart.addItem(12);
		//
		shoppingCart.addItemUnchecked(65);
		shoppingCart.addItemUnchecked(23);
	}

}  

/* 2)Shopping Cart Item Addition

You are assigned to develop a Java program for a simple online shopping cart using the ShoppingCart class. The class involves 
two custom exceptions: a checked exception (InvalidItemException) and an unchecked exception (OutOfStockException). 
These exceptions are designed to handle different scenarios related to adding items to a shopping cart.

* InvalidItemException (Checked Exception):
-> This exception should be thrown when an attempt is made to add an invalid quantity of items (non-positive) or when there are 
not enough items in stock for the specified quantity.

* OutOfStockException (Unchecked Exception):
-> This exception should be thrown when an attempt is made to add items exceeding the available stock.

* ShoppingCart Class:
-> The class should have a private instance variable availableItems representing the number of items in stock.
-> Implement a constructor to initialize the initial number of available items.
-> Implement a method addItem(int quantity) that adds items to the cart, throwing InvalidItemException for invalid quantities or 
insufficient stock.
-> Implement a method addItemUnchecked(int quantity) that simulates adding items, throwing OutOfStockException for 
quantities exceeding the available stock and handling IllegalArgumentException for invalid quantities.

* Main Class (ShoppingCartScenario):

-> In the main method, create an instance of ShoppingCart with an initial stock of 50 items.
-> Demonstrate the use of addItem for valid and invalid quantities, handling the InvalidItemException.
-> Demonstrate the use of addItemUnchecked for valid and invalid quantities, handling both IllegalArgumentException and
OutOfStockException.

Note: Ensure that the program provides clear error messages and handles exceptions appropriately. */




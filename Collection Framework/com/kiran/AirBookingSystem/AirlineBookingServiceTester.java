package com.kiran.AirBookingSystem;

public class AirlineBookingServiceTester 
{
	public static void main(String[] args) 
	{
		AirlineCustomer cust1 = new AirlineCustomer(101,"Pravin","pravin@gmail.com","12345");
		AirlineCustomer cust2 = new AirlineCustomer(102,"Yash","yash@gmail.com","0987654321");
		
		AirlineBookingService service = new AirlineBookingService();
		//service.bookFlight(cust1);
		//service.bookFlight(cust2);
		
		//System.out.println(service.isFirstTimeCustomer(cust1));
		//System.out.println(service.isFirstTimeCustomer(cust2));
		//System.out.println(service.isFirstTimeCustomer(cust1));
		
		//System.out.println(service.calculateBookingCost(cust1));
		//System.out.println(service.calculateBookingCost(cust2));
		//System.out.println(service.calculateBookingCost(cust1));
		
		System.out.println(service.printBookingDetails(cust1));
		System.out.println(service.printBookingDetails(cust2));
		System.out.println(service.printBookingDetails(cust1));
		

	}

}

/* Q2) 

AirlineCustomer Class:

Create a class named AirlineCustomer with the following private attributes:

customerId (int)

fullName (String)

email (String)

phoneNumber (String)

Implement a default constructor and a parameterized constructor that initializes all attributes.

Implement getter and setter methods for all attributes.

AirlineBookingService Class:


Create a class named AirlineBookingService to handle flight bookings.

Maintain an ArrayList of AirlineCustomer objects to store booking details.

Implement a method bookFlight that takes an AirlineCustomer object and adds it to the list of customers.

Implement a method isFirstTimeCustomer that takes an AirlineCustomer object and returns true if the customer is booking for the first time based on their phone number, false otherwise.

Implement a method calculateBookingCost that takes an AirlineCustomer object and a base cost per ticket as parameters. If the customer is booking for the first time, return a booking cost of 0; otherwise, return the base cost per ticket.

Implement a method printBookingDetails that takes an AirlineCustomer object and a booking cost as parameters and returns a message confirming the booking with the customer's full name and the booking cost.

AirlineBookingServiceTester Class:

Create a class named AirlineBookingServiceTester with a main method.

Inside the main method:

Create an instance of AirlineBookingService.

Create two instances of AirlineCustomer.

Book flights for both customers using the bookFlight method.

Test the isFirstTimeCustomer method for both customers and print the results.

Test the calculateBookingCost method for both customers with a base cost per ticket of 1500.0 and print the booking costs.

Test the printBookingDetails method for both customers and print the booking details.

Your implementation should demonstrate the functionality of the airline booking system. Make sure to include appropriate messages and output formats for better clarity.
*/

package com.kiran.ticketsystem;

public class Ticket 
{
	String source;
	String destination;
	double price;
	public Ticket(String source, String destination, double price) {
		super();
		this.source = source;
		this.destination = destination;
		this.price = price;
	}
	public void displayTicketDetails()
	{
		System.out.println("Source: "+source);
		System.out.println("Destination: "+destination);
		System.out.println("Price: "+price);
	}

}

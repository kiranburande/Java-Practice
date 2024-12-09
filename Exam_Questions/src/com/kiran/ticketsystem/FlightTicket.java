package com.kiran.ticketsystem;

public class FlightTicket extends Ticket
{
	String flightNumber;

	public FlightTicket(String source, String destination, double price, String flightNumber) {
		super(source, destination, price);
		this.flightNumber = flightNumber;
	}

	@Override
	public void displayTicketDetails() 
	{
		super.displayTicketDetails();
		System.out.println("Flight Number: "+flightNumber);
	}
	

}

package com.kiran.ticketsystem;

public class BusTicket  extends Ticket
{
	String busCompanyName;

	public BusTicket(String source, String destination, double price, String busCompanyName) {
		super(source, destination, price);
		this.busCompanyName = busCompanyName;
	}

	@Override
	public void displayTicketDetails() 
	{
		super.displayTicketDetails();
		System.out.println("Bus Company Name: "+busCompanyName);
	}
	

}

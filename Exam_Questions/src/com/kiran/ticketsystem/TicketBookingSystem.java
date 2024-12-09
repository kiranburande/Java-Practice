package com.kiran.ticketsystem;

public class TicketBookingSystem {

	public static void main(String[] args) 
	{
		TrainTicket trainTicket = new TrainTicket("City A","City B",50,123); 
		BusTicket busTicket = new BusTicket("City X","City Y",30,"XYZ Bus Company");
		FlightTicket flightTicket = new FlightTicket("City P","City Q",200,"ABC123");
		
		System.out.println("Train Ticket Details:");
		trainTicket.displayTicketDetails();
		
		System.out.println();
		
		System.out.println("Bus Ticket Details:");
		busTicket.displayTicketDetails();
		
		System.out.println();
		
		System.out.println("Flight Ticket Details:");
		flightTicket.displayTicketDetails();

	}

}

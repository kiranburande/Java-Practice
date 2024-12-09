package com.kiran.ticketsystem;

public class TrainTicket  extends Ticket
{
	int trainNumber;

	public TrainTicket(String source, String destination, double price, int trainNumber) {
		super(source, destination, price);
		this.trainNumber = trainNumber;
	}



	@Override
	public void displayTicketDetails() {
		 
		super.displayTicketDetails();
		System.out.println("Train Number: "+trainNumber);
	}
	

}

package com.kiran.TicketManagementSystem;

public class MainTicket {

	public static void main(String[] args) 
	{
		 Ticket regularTicket = new Ticket("Concert", 101, 50.0);
         VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
         StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);
         
         System.out.println("Regular Ticket:");
         System.out.println("Event: "+regularTicket.getEventName());
         System.out.println( regularTicket.getSeatNumber() <= 0 ? "Error Invalid Input" : "Seat Number: "+regularTicket.getSeatNumber());
         System.out.println(regularTicket.getPrice() <= 0 ? "Error Invalid Input" : "Price: $"+regularTicket.getPrice());
         
         System.out.println("\nVIP Ticket:");
         System.out.println("Event: "+vipTicket.getEventName());
         System.out.println(vipTicket.getSeatNumber() <= 0 ? "Error Invalid Input" : "Seat Number: "+vipTicket.getSeatNumber());
         System.out.println(vipTicket.getPrice() <= 0 ? "Error Invalid Input" : "Price: $"+vipTicket.getPrice());
         System.out.println("Special Acess: "+vipTicket.getSpecialAccess());
         
         System.out.println("\nStudent Ticket:");
         System.out.println("Event: "+ studentTicket.getEventName());
         System.out.println(studentTicket.getSeatNumber() <= 0 ? "Error Invalid Input" : "Seat Number: "+studentTicket.getSeatNumber());
         System.out.println(studentTicket.getPrice() <= 0 ? "Error Invalid Input" : "Price: $"+studentTicket.getPrice());
         System.out.println("Student Discount: "+studentTicket.isStudentDiscount());
 
	}

}

package com.kiran.AdressBookContacts;

import java.util.*;
public class MainClass 
{
	public static void main(String[] args) 
	{
		Contact contact = new Contact();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("********Options*******");
			System.out.println("1. Add Contact");
			System.out.println("2. Remove Contact");
			System.out.println("3. Exit");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();sc.nextLine();
			
			switch(choice)
			{
			case 1:System.out.println("Enter Contact Name :");
			       String name = sc.nextLine();
			       System.out.println("Enter Contact Number :");
			       long number = sc.nextLong();
			       contact.addContact(name, number);
				break;
				
			case 2:System.out.println("Enter Contact Name :");
		           String name1 = sc.nextLine();
		           contact.removeContact(name1);
				break;
				
			case 3:System.out.println("Program Stopped...");
				System.exit(0);
				
			default: System.out.println("Invalid Choice...");
			}
				
		}
	}

}

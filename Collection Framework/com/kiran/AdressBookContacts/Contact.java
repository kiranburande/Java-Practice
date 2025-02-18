package com.kiran.AdressBookContacts;
import java.util.*;
public class Contact 
{
	HashMap<String, Long> hMap = new HashMap<>();
	
	public void addContact(String name, Long number)
	{
		hMap.put(name, number);
		System.out.println("Contact is added...");
	}
	public void removeContact(String name)
	{
		if(hMap.isEmpty())
		{
			System.out.println("Address Book is empty");
		}
		else {
			hMap.remove(name);
			System.out.println("Contact is removed...");
		}
		
	}	
}

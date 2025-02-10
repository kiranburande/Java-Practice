package com.kiran.AirBookingSystem;

import java.util.*;

public class AirlineBookingService 
{
	ArrayList<AirlineCustomer> list = new ArrayList<>();
	
	public void bookFlight(AirlineCustomer ac)
	{
		list.add(ac);
	}
	public boolean isFirstTimeCustomer(AirlineCustomer ac)
	{
		for(AirlineCustomer a : list)
		{
			if(a.getPhoneNumber().equals(ac.getPhoneNumber()))
				return false;
		}
		list.add(ac);
		return true;
	}
	
	public int calculateBookingCost(AirlineCustomer ac)
	{
		if(isFirstTimeCustomer(ac))
		{
			return 0;
		}
		else {
			return 1500;
		}
	}
	
	public String printBookingDetails(AirlineCustomer ac)
	{
		return ac.getFullName()+" your ticket is confirmed with Ticket Charge RS."+calculateBookingCost(ac);
	}
}

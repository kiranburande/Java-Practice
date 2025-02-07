package com.kiran.CabCustomerService;


import java.util.*;

public class CabCustomerService
{
	private ArrayList<CabCustomer> cabCust = new ArrayList<>();
	
	public void addCabCustomer(CabCustomer c)
	{
		if(isFirstCustomer(c)) 
		{
			cabCust.add(c);
		   System.out.println("Customers Added Successfully");
	    }
		else
			System.out.println("Customer Already Exists.");
	}
	
	public boolean isFirstCustomer(CabCustomer customers)
	{
		for(CabCustomer customer: cabCust ) {
			if(customer.getPhone().equals(customers.getPhone()))
				return false;
		}
	   return true;	
	}
	
	public double calculateBill(CabCustomer c)
	{
		if(isFirstCustomer(c))
		{
			cabCust.add(c);
			return 0;
		}
		else if(c.getDistance() > 0 && c.getDistance() <=4)
		{
			return 80;
		}
		else if(c.getDistance() > 4)
		{
			return 80 +(c.getDistance()*6);
		}
		System.out.println("Cannot Insert Nagative Distance");
		return -1;
	}
	
	public String printBill(CabCustomer c) 
	{
		//System.out.println();
		return c.getCustomerName()+" Please pay your bill of Rs."+calculateBill(c);
	}
	
}

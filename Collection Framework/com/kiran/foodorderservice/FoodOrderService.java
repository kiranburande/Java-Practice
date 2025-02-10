package com.kiran.foodorderservice;

import java.util.*;

public class FoodOrderService 
{
	ArrayList<FoodCustomer> list = new ArrayList<>();
	
	public void placeOrder(FoodCustomer fc)
	{
		list.add(fc);
	}
	public boolean isFirstTimeCustomer(FoodCustomer fc)
	{
		for(FoodCustomer f: list )
		{
			if(f.getPhoneNumber().equals(fc.getPhoneNumber()))
			{
				return false;
			}
		}
		list.add(fc);
		return true;
	}
	public int calculateBill(FoodCustomer fc)
	{
		if(isFirstTimeCustomer(fc))
		{
			return 0;
		}
		else {
			return 50;
		}
	}
	
	public String printBill(FoodCustomer fc)
	{
		return fc.getCustomerName()+" your bill is :"+calculateBill(fc);
	}
}

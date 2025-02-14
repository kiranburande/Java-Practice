package com.kiran.ComparableInterfaceDemo2;
import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		Customer cust1 = new Customer(1234567,"Pravin",3000d);
		Customer cust2 = new Customer(1234789,"Yash",5000d);
		Customer cust3 = new Customer(7654567,"John",8000d);
		Customer cust4 = new Customer(1456867,"Kiran",2000d);
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		list.add(cust4);
		
		Comparator<Customer> comp1 = new Comparator<>()
				{
					@Override
					public int compare(Customer o1, Customer o2) {
						
						return o1.getCustomerNumber().compareTo(o2.getCustomerNumber());
					}
			
				};
				
		Collections.sort(list,comp1);
		System.out.println("\t\t\t******Based on customer number****");
		list.forEach(System.out::println);
		
		Collections.sort(list,(p1,p2)->p1.getCustomerName().compareTo(p2.getCustomerName()));
		System.out.println("\t\t\t****Based on customer name****");
		for(Customer c :list)
		{
			System.out.println(c);
		}
		
		Collections.sort(list,(p1,p2)-> p1.getCustomerBill().compareTo(p2.getCustomerBill()));
		System.out.println("\t\t\t****Based on customer Bill****");
		for(Customer c :list)
		{
			System.out.println(c);
		}
		
	}
}

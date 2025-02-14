package com.kiran.ComparableInterfaceDemo1;

import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(1001,"Laptop",40000d);
		Product p2 = new Product(1003,"Mobile",25000d);
		Product p3 = new Product(1002,"Buds",2500d);
		
		ArrayList<Product> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Collections.sort(list);
		
		for(Product p:list) {
			System.out.println(p);
		}

	}

}

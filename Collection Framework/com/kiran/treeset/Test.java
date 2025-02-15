package com.kiran.treeset;

import java.util.*;

record Product(Integer pId, String pName)
{
	public Product 
	{
	   if(pId<=0)throw new IllegalArgumentException();
	}
}

public class Test 
{
	public static void main(String[] args) 
	{
		Set<Product> list1 = new TreeSet<>((p1,p2)->p1.pId().compareTo(p2.pId()));
		Set<Product> list2 = new TreeSet<>((p1,p2)->p2.pId().compareTo(p1.pId()));
		Set<Product> list3 = new TreeSet<>((p1,p2)->p1.pName().compareTo(p2.pName()));
		Set<Product> list4 = new TreeSet<>((p1,p2)->p2.pName().compareTo(p1.pName()));
		
		Product p1 = new Product(1,"Smith");
		Product p2 = new Product(2,"Zuber");
		Product p3 = new Product(3,"Aditya");
		Product p4 = new Product(4,"John");
		
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		list1.add(p4);
		System.out.println(list1);
		
		list2.add(p1);
		list2.add(p2);
		list2.add(p3);
		list2.add(p4);
		System.out.println(list2);
		
		list3.add(p1);
		list3.add(p2);
		list3.add(p3);
		list3.add(p4);
		System.out.println(list3);
		
		list4.add(p1);
		list4.add(p2);
		list4.add(p3);
		list4.add(p4);
		System.out.println(list4);
		
	}
	
}

package com.kiran.Day5;

public class Student3Main 
{
	public static void main(String[] args) 
	{
		ScienceStudent s1 = new ScienceStudent("Anjali", 101, 85, 90, 80);
		 ArtsStudent a1 = new ArtsStudent("Aryan", 102, 75, 80, 85);
		 
		 s1.displayDetails();
		 System.out.println(s1.calculatePercentage());
		 
		 a1.displayDetails();
		 System.out.println(a1.calculatePercentage());

		
	}

}

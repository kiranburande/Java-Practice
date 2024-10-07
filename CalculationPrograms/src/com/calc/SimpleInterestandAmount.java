package com.calc;

public class SimpleInterestandAmount 
{
 public static void main(String[] args)
 {
	int Principal = Integer.parseInt(args[0]);
	float Rate = Float.parseFloat(args[1]);
	int Time = Integer.parseInt(args[2]);
	
	double SInterest = (Principal*Rate*Time)/100;
	
	double Amount = SInterest + Principal;
	
	System.out.println("The Principal Amount :"+Principal);
	System.out.println("The rate of interest per month :"+Rate);
	System.out.println("The Time in Month :"+Time);
	System.out.println("The Simple Interest :"+SInterest);
	System.out.println("The Total Amount :"+Amount);
	
	
}
  
}



/* Write a program to enter Principal, Rate and Time. Calculate and display Simple Interest and Amount. */
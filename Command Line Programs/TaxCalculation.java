package com.kiran;

public class TaxCalculation
{
	public static void main(String[] args)
	{
		double income = 990000;
		double tax = (income*4.9)/100;
		
		System.out.println("The Tax for taxable income is :"+tax);
		// System.out.println("The Tax for taxable income is :"+((double)(income*4.9/100)));
	}
	

}

package com.kiran.m1;

import java.util.Scanner;

import com.kiran.m2.TwoDigitsSum;

public class SumOfDigitOf2Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two digit number :");
		int num = sc.nextInt();
		if(num<100 && num>=10)
		{
			int sum = TwoDigitsSum.getSumOfDigits(num);
			
			System.out.println("The Sum Of Two Digit Number is :"+sum);	
			sc.close();
		}
		else System.out.println("Given Number is not two digit number");
		
	}

}


/*  Program-1
Define a method which returns the sum of digits of the given two digit number.
Write the method with the following specifications: 
Name of the BLC class:TwoDigitsSum
Name of method: getSumOfDigits()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 34, return 7

Create an ELC class Main to test the application */
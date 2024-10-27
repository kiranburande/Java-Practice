package com.kiran.m1;

import java.util.Scanner;

import com.kiran.m2.TwoDigitsDifference;

public class DifferenceOfTwoDigitNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Digit Number");
		
		int num = sc.nextInt();
		
		if(num >=10 && num <100)
		{
			int diff = TwoDigitsDifference.getDiffOfDigits(num);
			
			System.out.println("The Difference Between Two Digit is :"+diff);
			sc.close();
		}
		else System.out.println("Given Number is not a Two Digit Number");
		
	}

}


/*Define a method which returns the difference of digits of the given two digit number.
Write the method with the following specifications: 
Name of the BLC class:TwoDigitsDifference
Name of method: getDiffOfDigits()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 83, 8 - 3 return 5.  If x = 38, 3 - 8 return -5.

Create an ELC class Main to test the application   */
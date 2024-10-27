package com.kiran.m1;

import java.util.Scanner;

import com.kiran.m2.RoundedSum;

public class RoundedSumElc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		int num1 = sc.nextInt();
		System.out.println("b = ");
		int num2 = sc.nextInt();
		System.out.println("c = ");
		int num3 = sc.nextInt();
		
		String sum = RoundedSum.sumOfRoundedValues(num1, num2, num3);
		
		System.out.println(sum);
		sc.close();
		
	}

}

/*  Define a method which returns the sum of three rounded numbers.
  If the right most digit of the number is less than 5, then round off its
 value to the previous multiple of 10 otherwise if the right most digit of the
 number is greater or equal to 5, and then round off to the next multiple of 10. 
 
Write the method with the following specifications: 
Name of the BLC class:RoundedSum
Name of method: sumOfRoundedValues() 
Access Modifier : public, static
Arguments: three argument of type integer
Return type: an integer value 
For example
If a = 23, b = 34, c = 66
   20 + 30 + 70 = 120
Note:Don't use any control statements and looping statements

Create an ELC class Main to test the application  */
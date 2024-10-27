package com.kiran.m1;

import java.util.Scanner;

import com.kiran.m2.NextMultipleOfHundred;

public class NextMultipleOfHundredElc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int  num = sc.nextInt();
	 
		int nextmul = NextMultipleOfHundred.getNextMultipleOfHundred(num);
			
		System.out.println("The Next Multiple Of 100 of Given Number is "+nextmul);
		sc.close();
		
 		
	}

}

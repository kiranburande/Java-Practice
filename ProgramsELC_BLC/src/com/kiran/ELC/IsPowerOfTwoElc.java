package com.kiran.m1;

import java.util.Scanner;

import com.kiran.m2.IsPowerOfTwo;

public class IsPowerOfTwoElc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		
		boolean is = IsPowerOfTwo.checkNumber(number);
		
		System.out.println(is?number+" is a power of 2" : number +" is not a power of 2");
	}

}

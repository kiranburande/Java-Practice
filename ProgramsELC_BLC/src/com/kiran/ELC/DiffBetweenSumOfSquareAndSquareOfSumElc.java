package com.kiran.m1;

import java.util.Scanner;

import com.kiran.m2.DiffBetweenSumOfSquareAndSquareOfSum;

public class DiffBetweenSumOfSquareAndSquareOfSumElc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		
		int diff = DiffBetweenSumOfSquareAndSquareOfSum.calculateDifference(number);
		
		System.out.println("The Difference between square of sum and sum of square of "+number+" is :"+diff);
		
		
	}

}

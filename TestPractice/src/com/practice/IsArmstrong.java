package com.practice;

import java.util.Scanner;

public class IsArmstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int sum =0;
		int num1 = num;
		int j=0;
		
		while(num!=0)
		{
			j++;
			num/=10;
		}
		
		num = num1;
		
		while(num!=0)
		{
			int digit = num%10;
			sum = sum + (int)Math.pow(digit, j);
			num/=10;
		}
		
		
		if(num1 == sum)
		{
			System.out.println("It is armstrong number");
		}
		else {
			System.out.println("It is not armstrong");
		}
	}

}

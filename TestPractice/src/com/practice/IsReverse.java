package com.practice;

import java.util.Scanner;

public class IsReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int sum =0;
		while(num != 0)
		{
			sum = (sum*10)+(num%10); 
			num/=10;
		}
		System.out.println("The reverse is :"+sum);
		
	}

}

package com.practice;

import java.util.Scanner;

public class IsPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int c=0;
		if(num<= 1) {
			System.out.println("It is not a Prime number");
			return;
		}
			
		for(int i=2;i<num;i++)
		{
			if(num%i==0) {
				c++;
			}
		}
		if(c==0)
		{
			System.out.println("It is prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}

}

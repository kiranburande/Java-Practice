package com.practice;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int i = 6;
		int sum = 1;
		
		while(i!=0)
		{
			sum = sum*i;
			i--;
		}
		System.out.println(sum);
		
	}

}

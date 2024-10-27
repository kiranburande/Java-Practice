package com.practice;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,s=0,i=5;
		
		while(i!=0)
		{
			System.out.println(a);
			s=a+b;
			a=b;
			b=s;
			i--;
		}
		
	}

}

package com.kiran;

public class FactorialByCommandLine 
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int sum =1,b=a;
		while(a!=0)
		{
			sum=sum*a;
			a--;
		}
		
		System.out.println("The factorial of "+b+" is "+sum);
	}

}

package com.kiran;

public class SwapWithout3rdVar 
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		a=a+b; 
		b=a-b;
		a=a-b;
		System.out.println("The swap is :"+a+" "+b);
	}

}
 
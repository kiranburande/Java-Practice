package com.kiran.m2;

public class TwoDigitsSum 
{
	public static int getSumOfDigits(int num)
	{
		int s=0;
		while(num!=0)
		{
			s=s+(num%10);
			num=num/10;
		}
		return s;
	}

}

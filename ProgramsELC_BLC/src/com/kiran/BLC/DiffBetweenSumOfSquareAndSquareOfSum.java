package com.kiran.m2;

public class DiffBetweenSumOfSquareAndSquareOfSum 
{
	
	public static int calculateDifference(int number)
	{
		int i;
		int sum1 = 0;
		int sum2 = 0;
		
		for(i=1 ; i <= number;i++)
		{
			sum1 = sum1 + (i);
		}
		sum1 = sum1*sum1;
		
		for(i=1;i<=number;i++)
		{
			sum2 = sum2 + (i)*(i);
		}
		
		if(sum1>sum2) {
			return sum1-sum2;
		}
		else
		{
			return sum2-sum1;
		}
		
	}

}

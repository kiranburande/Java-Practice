package com.kiran.arithmetic_calculation;

public class MyCalculator implements AdvancedArithmetic 
{

	@Override
	public int divisorSum(int n) 
	{
		int sum=0;
		if(n <= 0)
		{
			System.err.println("Input must be a positive integer.");
			System.exit(0);
		}
		else 
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i == 0)
				{
					sum += i;
				}
			}
		}
		 
		return sum;
	}

}

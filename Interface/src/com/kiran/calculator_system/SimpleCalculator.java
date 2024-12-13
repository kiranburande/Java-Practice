package com.kiran.calculator_system;

public class SimpleCalculator implements Calculator {

	@Override
	public void calculateSum(int... value) 
	{
		int sum=0;
		for(int val : value)
		{
			sum += val;
		}
		
		System.out.println("Sum of the numbers: "+sum);
	}

}

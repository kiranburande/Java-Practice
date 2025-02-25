package com.kiran.test;

import java.util.Arrays;

public class Demo3 
{
	public static void main(String[] args) 
	{
		Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		int []numbers1 = Arrays.stream(numbers).filter(Demo3::isPrime).mapToInt(Integer::intValue).toArray();
		System.out.println("Prime Numbers: "+Arrays.toString(numbers1));
	}
	public static boolean isPrime(int num)
	{
		if(num<2)
			return false;
		for(int i=2; i<= num/2;i++)
		{
			if(num%i==0) 
				return false;
		}
		return true;
	}
}

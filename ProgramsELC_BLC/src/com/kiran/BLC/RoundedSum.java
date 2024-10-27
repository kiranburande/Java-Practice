package com.kiran.m2;

public class RoundedSum 
{
	public static String sumOfRoundedValues(int num1,int num2,int num3)
	{
		if(num1%10 < 5) num1=(num1/10)*10;
		
		else num1 = (num1/10+1)*10;
		
		
		if(num2%10 < 5) num2=(num2/10)*10;
		
		else num2 = (num2/10+1)*10;
				
		
		if(num3%10 < 5 ) num3=(num3/10)*10;
		
		else num3 = (num3/10+1)*10;
		
		int sum = num1 + num2 +num3 ;
		
		return num1+" + "+ num2 +" + "+ num3 + " = " + sum;
		
	}

}

package com.kiran.m2;

public class IsPowerOfTwo 
{
	public static boolean checkNumber(int number)
	{
		int i;int c=0;
		
		for(i=2;i<=number;)
		{
			if(i==number)
			{
				c++;
				break;
			}
			i=i*2;
		}
		if(c==0)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}

}

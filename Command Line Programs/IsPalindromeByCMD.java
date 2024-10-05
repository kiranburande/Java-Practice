package com.kiran;

public class IsPalindromeByCMD 
{
public static void main(String[] args) 
{
	int a = Integer.parseInt(args[0]);
	
	if(a<0)a=-a;
	int b=a , sum = 0;
	
	while (b!=0)
	{
		sum=sum*10+(b%10);
		b/=10;
	}
	if(sum==a)System.out.println("It is a Palindrome.");
	else System.out.println("It is not a Palindrome.");
 	 
}
}

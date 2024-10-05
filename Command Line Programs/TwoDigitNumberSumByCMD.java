package com.kiran;

public class TwoDigitNumberSumByCMD 
{
public static void main(String[] args)
{
	int a = Integer.parseInt(args[0]);
	
	int b=a%10;
	int c=a/10;
	
	System.out.println((b)+" + "+(c) +" = " +(b+c));
}
}

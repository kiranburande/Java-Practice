package com.kiran;

public class TotalSalCalcByXCMD
{
public static void main(String[] args) 
{
	int a = Integer.parseInt(args[0]);
	int hra=(a*15)/100;
	int cea = (a*15)/100  , bea = (a*10)/100;
	
	System.out.println("Basic salary is :"+a);
	System.out.println("HRA is :"+hra);
	System.out.println("Conveyance Allowance is :"+cea);
	System.out.println("Entertainment Allowance is :"+bea);
	System.out.println("Total Sal is :"+(a+hra+cea+bea));
}
}

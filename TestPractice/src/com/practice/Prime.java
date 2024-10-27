package com.practice;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args) 
	{
	   int c=0;
	   
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
	   int j = sc.nextInt();
	   
	   for(int i=1;i<=j;i++)
	   {
		   if(j%i==0)c++;
	   }
	   
	   if(c==2) 
	   {
		   System.out.println("It is a Prime number.");
	   }
	   else
	   {
		   System.out.println("It is not a Prime number.");
	   }
	   
		sc.close();
	}

}

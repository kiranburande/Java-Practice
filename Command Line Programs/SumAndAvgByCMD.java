package com.kiran;

public class SumAndAvgByCMD 
{
public static void main(String[] args)
{
 int a = Integer.parseInt(args[0]);	
 int b = Integer.parseInt(args[1]);
 int c = Integer.parseInt(args[2]);
 
 System.out.println("The Sum is :"+(a+b+c));
 System.out.println("The Average is :"+( (double) ((a+b+c)/3.0) ) );
}
}

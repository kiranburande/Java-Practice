package com.kiran;

public class NextMultipleOf100ByCMD
{
public static void main(String[] args) 
{
   int a = Integer.parseInt(args[0]);
   
   System.out.println("The Next 100 multiple of "+a+" is :"+((a/100+1)*100));
}
}

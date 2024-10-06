package com.kiran;

public class PreMultipleOf100ByCMD 
{
 public static void main(String[] args) 
{
     int a = Integer.parseInt(args[0]);
     int b=(a/100)*100;
     
     System.out.println("The Previous 100 Multiple of "+a+" is :"+b);
     
}
}

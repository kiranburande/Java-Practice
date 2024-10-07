package com.kiran;

public class AddSubMulDivBy3rdVar 
{
public static void main(String[] args) 
{
 int a = Integer.parseInt(args[0]);
 int b = Integer.parseInt(args[1]);
 int add = a+b;
 int sub = a-b;
 int mul = a*b;
 int div = a/b;
 
 System.out.println("The Addition is :"+add);
 System.out.println("The Substraction is :"+sub);
 System.out.println("The Multiplication is :"+mul);
 System.out.println("The Division is :"+div);
}
}

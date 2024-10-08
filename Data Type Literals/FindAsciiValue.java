package com.literals;

public class FindAsciiValue 
{
 public static void main(String[] args) 
 {
	char ch = args[0].charAt(0);
	
	System.out.println("The Ascii Value of "+ch+" is :"+((int)ch));
 }
}


/*
Write a java program to find the ASCII value of a character
For Example
Output sholud be in below formart
The ASCII value of a is :97  */
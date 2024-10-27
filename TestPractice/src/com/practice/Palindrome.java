package com.practice;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		 int i = 0;
		 String str = "radar";
		 
		 int j = str.length()-1;
		 
		 for(i=0;i<j/2;i++,j--)
		 {
			 if(str.charAt(i) != str.charAt(j))
			 {
				 System.out.println("It is not Palindrome.");
				 return;
			 }
			 
		 }
		 System.out.println("It is a Palindrome");
		
	}

}

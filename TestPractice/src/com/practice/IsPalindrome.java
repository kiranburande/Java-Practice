package com.practice;

import java.util.Scanner;

public class IsPalindrome {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word : ");
		String str = sc.next();
		
		int j = str.length()-1;
		
		for(int i=0 ; i<j/2 ; i++,j--)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				System.out.println("It is not a palindrome");
				return;
			}
		}
		System.out.println("It is a palindrome");
		
	}

}

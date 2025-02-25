package com.kiran.test;

import java.util.Arrays;
import java.util.List;

public class Demo6 
{
	public static void main(String[] args) 
	{
		String[] words = {"madam", "hello", "racecar", "java", "level", "world"};

		//Output : Palindrome Words: [madam, racecar, level]
		
		List<String> list = Arrays.stream(words).filter(Demo6::isPalindrome).toList();
		
		System.out.println("Palindrome Words: "+list);

	} 
	public static boolean isPalindrome(String str)
	{
		for(int i =0,j=str.length()-1;i < str.length()/2;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
		}
		return true;
	}
}

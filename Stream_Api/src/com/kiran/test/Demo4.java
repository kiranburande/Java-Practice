package com.kiran.test;

import java.util.Arrays;
import java.util.List;

public class Demo4 
{
	public static void main(String[] args) 
	{
		String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
	   // Output : [Rohit, Smirti, Richa]
		
		List<String> list = Arrays.stream(words).filter(str->str.length()>3).toList();
		System.out.println(list);
	}
}

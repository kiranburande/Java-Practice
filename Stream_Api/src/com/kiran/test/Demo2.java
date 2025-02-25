package com.kiran.test;

import java.util.Arrays;
import java.util.List;

public class Demo2 
{
	public static void main(String[] args) 
	{
		String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		   List<String> list = Arrays.stream(names).filter(str->str.toLowerCase().contains("a")).toList();
		   System.out.println("Names Containing 'A' or 'a' : "+list);
	}
}

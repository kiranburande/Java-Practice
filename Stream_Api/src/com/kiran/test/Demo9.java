package com.kiran.test;

import java.util.Arrays;
import java.util.List;

public class Demo9 
{
	public static void main(String[] args) 
	{
		 Boolean[] flags = {true, false, true, false, true};

		   // Yes/No Values: [Yes, No, Yes, No, Yes]
		 
		 List<String> list = Arrays.stream(flags).map(b-> b?"Yes":"No").toList();
		 System.out.println("Yes/No Values: "+list);
	}
}

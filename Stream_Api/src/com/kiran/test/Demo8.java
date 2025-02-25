package com.kiran.test;

import java.util.Arrays;
import java.util.List;

public class Demo8 
{
	public static void main(String[] args) 
	{
		String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};

	    //Output : [VIRAT, SANJU, ROHIT, BUMRAH]
		
		List<String> list = Arrays.stream(names).map(str-> str.toUpperCase()).toList();
		
		System.out.println(list);
	}
}

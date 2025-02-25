package com.kiran.test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo5 
{
	public static void main(String[] args) 
	{
		Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
	    //Output : Unique Numbers: [1, 2, 3, 4, 5, 6, 7, 8]
		
		Set<Integer> collect = Arrays.stream(numbers).collect(Collectors.toSet());
		
		System.out.println("Unique Numbers: "+collect);

	}
}

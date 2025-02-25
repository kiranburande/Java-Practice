package com.kiran.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
		Stream<Integer> stream = Arrays.stream(numbers);
		
		int []numbers1 = stream.filter(num->num>0).mapToInt(Integer::intValue).toArray();
		System.out.println("Positive Numbers: "+Arrays.toString(numbers1));
		
	}
}

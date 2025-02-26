package com.kiran.class_programs;

import java.util.stream.Stream;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8);
		numbers.forEach(System.out::println);
	}
}

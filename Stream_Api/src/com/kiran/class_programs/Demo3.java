package com.kiran.class_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo3 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		Stream<Integer> stream = numbers.stream();
		stream.forEach(System.out::println);
		System.out.println("======================");
		List<String> list = List.of("Raj","Scott","Smith","Alen");
		Stream<String> stream2 = list.stream();
		stream2.forEach(System.out::println);
	}
}

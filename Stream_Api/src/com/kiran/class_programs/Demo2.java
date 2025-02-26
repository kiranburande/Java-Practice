package com.kiran.class_programs;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Demo2 
{
	public static void main(String[] args) 
	{
		int arr1[] = {10,20,30,40,50};
		IntStream stream = Arrays.stream(arr1);
		stream.forEach(System.out::println);
		System.out.println("--------------------------");
		
		long arr2[]= {10,20,30,40,50};
		LongStream stream2 = Arrays.stream(arr2);
		stream2.forEach(System.out::println);
		System.out.println("--------------------------");
		
		double arr3[]= {10.20,34.65,35.67,25.86,85.33};
		DoubleStream stream3 = Arrays.stream(arr3);
		stream3.forEach(System.out::println);
		System.out.println("--------------------------");
		
		String arr4[]= {"Hyd","Indore","Mumbai","Pune"};
		Stream<String> stream4 = Arrays.stream(arr4);
		stream4.forEach(System.out::println);
	}
}

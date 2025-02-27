package com.kiran.Feb2;

import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicateByFlatMap 
{
	public static void main(String[] args) 
	{
		List<String> listOfNames = 
			List.of("Akshay","Rama","Kiran","Yash","Pravin","Emraan","Kiran","Akshay","Pavan");
		listOfNames.stream().flatMap(str->Stream.of(str)).distinct().forEach(System.out::println);
	}
}

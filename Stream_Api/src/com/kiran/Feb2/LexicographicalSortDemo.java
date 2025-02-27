package com.kiran.Feb2;

import java.util.List;

public class LexicographicalSortDemo 
{
	public static void main(String[] args) 
	{
		List<String> fruits = List.of("apple", "banana", "orange", "elephant", "kiwi", "umbrella", "owl");
		
		fruits.stream().filter(str->str.length()>4).sorted().forEach(System.out::println);
	}
}

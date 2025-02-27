package com.kiran.Feb2;

import java.util.List;
import java.util.function.Predicate;

public class FilterLength 
{
	public static void main(String[] args) 
	{
		List<String> listOfNames = List.of("Akshay","Pranav","Arnav","Usha","Rama","Kiran","Yash","Pravin","Emraan");
		
		 Predicate<String> startsWithVowelAndLengthGreaterThanFive = str -> {
	            
	            char firstChar = str.toLowerCase().charAt(0);
	            return "aeiou".indexOf(firstChar) != -1 && str.length() > 5;
	        };
		
		List<String> list = listOfNames.stream().filter(startsWithVowelAndLengthGreaterThanFive)
		.toList();
		
		System.out.println(list);
	}
}

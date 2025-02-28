package com.kiran.stream_api;

import java.util.List;

public class FourDigitElements 
{
	public static void main(String[] args) 
	{
		List<String> list = List.of("Toby", "Anna", "Leroy", "Alex");
		list.stream().filter(str->str.length()==4).sorted().limit(2).forEach(System.out::println);
	}
}

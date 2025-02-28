package com.kiran.stream_api;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringConcatDemo 
{
	public static void main(String[] args) 
	{
		Stream<String> stream = Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!");
		String result = stream.filter(str-> !str.isEmpty()).collect(Collectors.joining());
		
		System.out.println(result);
	}
}

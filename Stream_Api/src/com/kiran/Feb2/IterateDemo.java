package com.kiran.Feb2;

import java.util.stream.Stream;

public class IterateDemo 
{
	public static void main(String[] args) 
	{
		Stream.iterate(1, n -> n+1).filter(num->num%2==1).limit(10).map(num->num*num).forEach(System.out::println);
	}

}

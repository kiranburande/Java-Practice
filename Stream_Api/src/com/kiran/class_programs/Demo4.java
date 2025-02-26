package com.kiran.class_programs;

import java.util.stream.Stream;

public class Demo4 
{
	public static void main(String[] args) 
	{
		Stream<Double> stream = Stream.generate(()->
		Math.random());
		stream.limit(10).forEach(System.out::println);
		System.out.println("----------------------");
		
		Stream<Integer> iterate = Stream.iterate(15, n->n+1);
		iterate.limit(5).forEach(System.out::println);
	}
}

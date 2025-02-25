package com.kiran.test;

import java.util.Arrays;
import java.util.List;

public class Demo7 
{
	public static void main(String[] args) {
		Integer[] numbers = {10, 20, 30, 40, 50};
	   // Converted Strings: [Number: 10, Number: 20, Number: 30, Number: 40, Number: 50]
		List<String> list = Arrays.stream(numbers).map(num->"Number: "+num).toList();
		
		System.out.println(list);
	}
}

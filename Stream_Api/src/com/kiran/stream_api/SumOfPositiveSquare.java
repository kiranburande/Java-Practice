package com.kiran.stream_api;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfPositiveSquare 
{
	public static void main(String[] args) 
	{
		Integer []numbers = {-3, 2, -5, 6, -1, 4};
		Integer orElse = Arrays.stream(numbers).filter(num->num>0).map(num->num*num).reduce((a,b)->a+b).orElse(0);
		System.out.println(orElse);
	}
	
}

package com.kiran.feb_28;
import java.util.*;

public class Test15 
{
	public static void main(String[] args) 
	{
		List<Integer> list = List.of(2, 3, 4, 5, 6);
		list.stream().takeWhile(x -> x >= 0).map(x -> x * 0 + 2 + 3).peek(System.out::print).toList();
	}
}

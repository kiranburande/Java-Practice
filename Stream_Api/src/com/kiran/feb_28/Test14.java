package com.kiran.feb_28;
import java.util.*;

public class Test14 
{
	public static void main(String[] args) {
		List<String> al = Arrays.asList("A", "B", "C", "D");
		List<String> list = al.stream().skip(1).filter(x -> x.startsWith("B")).peek(x -> {}).toList();
		System.out.println(list);

	}
}

package com.kiran.feb_28;
import java.util.*;
import java.util.stream.Collectors;

public class Test3 
{
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(20);
		arrayList.add(21);
		arrayList.add(22);
		arrayList.add(23);
		List<Integer> collect = arrayList.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
		System.out.println(collect);
	}
}

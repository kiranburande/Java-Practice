package com.kiran.feb_28;

import java.util.*;

public class Test2 
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(16);
		list.add(14);
		Optional<Integer> max = list.stream().max((x, y) -> x.compareTo(y));
		System.out.println(max);
	}

}

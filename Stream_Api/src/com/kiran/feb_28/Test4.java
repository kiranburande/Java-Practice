package com.kiran.feb_28;
import java.util.*;

public class Test4 
{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("BC");
		al.add("CDE");
		al.add("DEFG");
		List<String> list = al.stream().filter(x -> x.length() >= 2).peek(x -> {}).toList();
		System.out.println(list);
	}
}

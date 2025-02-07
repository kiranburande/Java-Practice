package com.kiran.ArrayList;

import java.util.*;

public class ReverseArrayDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr = new ArrayList<>();
		arr.add("AA");
		arr.add("BB");
		arr.add("CC");
		arr.add("DD");
		
//		List<String> reversed = arr.reversed();
//		System.out.println(reversed);
		
		ListIterator<String> listIterator = arr.listIterator();
		System.out.println(listIterator);
	}
}
//Q1) Write a program to reverse ArrayList in java?
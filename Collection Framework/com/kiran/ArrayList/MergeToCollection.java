package com.kiran.ArrayList;

import java.util.*;

public class MergeToCollection 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		
		arr1.add("Apple");
		arr1.add("Banana");
		arr1.add("Mango");
		System.out.println(arr1);
		
		arr2.add("Guava");
		arr2.add("WaterMelon");
		System.out.println(arr2);
		
		arr1.addAll(arr2);
		System.out.println(arr1);
	}
}
// Q4) Write a program to merge to Collection data which contains fruits name.
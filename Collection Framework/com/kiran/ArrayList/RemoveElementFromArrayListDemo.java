package com.kiran.ArrayList;

import java.util.*;

public class RemoveElementFromArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		
		System.out.println(arr);
	
		arr.remove(Integer.valueOf(6));
		System.out.println(arr);
		
	}
}
// Q3) Write a program to remove element from ArrayList which contains only numbers (ArrayList<Integer>) by 
//using remove method of List interface as well as remove method of Collcetion interface. 

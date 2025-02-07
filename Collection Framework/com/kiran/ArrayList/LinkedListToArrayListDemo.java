package com.kiran.ArrayList;

import java.util.*;

public class LinkedListToArrayListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		ArrayList<Integer> arr = new ArrayList<>(list);
		//ArrayList<Integer> arr = new ArrayList<>();
		//arr.addAll(list);
		System.out.println(arr);
	}
}

//Q2) Write a program to convert LinkedList to ArrayList?

package com.kiran.ArrayList;

import java.util.*;

public class ArraylistInBothDirection 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(10);
		arr1.add(11);
		arr1.add(12);
		arr1.add(13);
		arr1.add(14);
		
		ListIterator<Integer> listIterator = arr1.listIterator();
		System.out.println("In Forward Direction");
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		System.out.println("In Backward Direction");
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
	}
}

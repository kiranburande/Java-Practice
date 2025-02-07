package com.kiran.WaysOfFetchCollectionObject;

import java.util.*;
public class WaysOfFetchingObjectDemo 
{
	public static void main(String[] args) 
	{
		Vector<String> colours = new Vector();
		colours.add("red");
		colours.add("yellow");
		colours.add("green");
		colours.add("white");
		colours.add("black");
		/*
		// 1. By using toString
		System.out.println(colours.toString());
		
		
		// 2. By using for each
		for(String s:colours)
		{
			System.out.println(s);
		}
		
		
		// 3. By using ordinary for loop
		for(int i=0;i<colours.size();i++)
		{
			System.out.println(colours.get(i));
		}
		
		
		// 4. by using Enumeration
		Enumeration<String> enm = colours.elements();
		
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		
		
		// 5. By using Iterator interface 
		Iterator<String> itr = colours.iterator();
		itr.forEachRemaining(color-> System.out.println(color));
		
		
		// 6. By using ListIterator interface
		ListIterator<String> listitr = colours.listIterator();
		System.out.println("In forward Direction");
		while(listitr.hasNext())
		{
			System.out.println(listitr.next());
		}
		
		System.out.println("In forward Direction");
		while(listitr.hasPrevious())
		{
			System.out.println(listitr.previous());
		}
		
		
		// 7. By using SplIterator interface
		Spliterator<String> splitr = colours.spliterator();
		splitr.forEachRemaining(color -> System.out.println(color));
		
		// 8. By using forEach() method
		colours.forEach(color -> System.out.println(color));
		*/
		
		// 9. By using Method Reference
		colours.forEach(System.out::println);
	}

}

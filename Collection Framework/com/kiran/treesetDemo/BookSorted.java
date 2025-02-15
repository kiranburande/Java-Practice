package com.kiran.treesetDemo;

import java.util.*;
record Book(String name, String author) implements Comparable<Book>
{

	@Override
	public int compareTo(Book o) 
	{
		return this.name().compareTo(o.name());
	}
	
}

public class BookSorted 
{
	public static void main(String[] args) 
	{
		TreeSet<Book> ts = new TreeSet();
		
		Book b1 = new Book("Python","Author1");
		Book b2 = new Book("Java","James Gosling");
		Book b3 = new Book(".Net","ZZZZ");
		Book b4 = new Book("Spring","DDD");
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		System.out.println(ts);
	}

}

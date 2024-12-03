package com.kiran.ambiguitymcqs;

class Test16
{		    
	public void accept(String x)
	{
		System.out.println("String");
	}
	
	public void accept(Integer x)
	{
		System.out.println("String");
	}	
	
	public void accept(Object y)
	{
		System.out.println("Object");
	}	
}
public class AmbiguityDemo16
{
	public static void main(String[] args) 
	{
		Test16 t1 = new Test16();
		//t1.accept(null);  // compiler get confused ambiguity issue 

	}
}
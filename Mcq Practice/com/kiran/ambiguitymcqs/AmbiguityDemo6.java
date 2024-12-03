package com.kiran.ambiguitymcqs;

class Test6
{		    
	public void accept(short ...s)
	{
		System.out.println("short :");
	}	
	
	public void accept(char ...s)
	{
		System.out.println("char :");
	}	
}
public class AmbiguityDemo6
{
	public static void main(String[] args) 
	{
		Test6 t1 = new Test6();
		// t1.accept(); // here char and short conversion is not possible
	}
}
package com.kiran.ambiguitymcqs;

class Test14
{		    
	public void accept(int x)
	{
		System.out.println("int");
	}	
	
	public void accept(long y)
	{
		System.out.println("long");
	}	
}
public class AmbiguityDemo14
{
	public static void main(String[] args) 
	{
		Test14 t1 = new Test14();
		t1.accept(9);

	}
}
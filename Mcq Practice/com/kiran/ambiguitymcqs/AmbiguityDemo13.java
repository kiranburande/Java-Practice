package com.kiran.ambiguitymcqs;

class Test13
{		    
	public void accept(int ...s)
	{
		System.out.println("int var args :");
	}	
	
	public void accept(int x, int ...y)
	{
		System.out.println("int int var args");
	}	
}
public class AmbiguityDemo13
{
	public static void main(String[] args) 
	{
		Test13 t1 = new Test13();
		//t1.accept(9); // compiler get confused

	}
}
package com.kiran.ambiguitymcqs;

class Test1
{	
	public void accept(long ...b)   
	{
		System.out.println("long :");
	}
	    
	public void accept(double ...s)
	{
		System.out.println("double :");
	}	
	
	public void accept(float ...s)
	{
		System.out.println("float :");
	}	
}
public class AmbiguityDemo1
{
	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		t1.accept();
	}
}

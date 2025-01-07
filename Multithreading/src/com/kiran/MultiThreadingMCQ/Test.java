package com.kiran.MultiThreadingMCQ;

class Foo extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("Hello Welcome here.."+i);
		}
	}
}
class Test
{
	public static void main(String[] args) 
	{
		Foo t = new Foo();
		t.start();
		t.start();
	}
}
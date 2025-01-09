package com.kiran.MultiThreadingMCQ;

class Test24 implements Runnable
{
	public void run() 
	{
		Thread thread = Thread.currentThread();
		Thread nit = thread.currentThread();
		System.out.println(nit.getName());			
	}
}

public class MultiThread14
{
	public static void main(String[] args) 
	{
		Test24 nit = new Test24();
		Thread thread = new Thread(nit);
		thread.start();
	}
}
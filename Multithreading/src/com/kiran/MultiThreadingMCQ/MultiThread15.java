package com.kiran.MultiThreadingMCQ;

class Test25 implements Runnable
{
	public void run() {
		Thread thread = Thread.currentThread();
		Thread nit = thread.currentThread();
		System.out.println(nit.getName());
				
	}
}
public class MultiThread15
{
	public static void main(String[] args) 
	{
		Test25 nit = new Test25();
		Thread thread = new Thread(nit);
		thread.setName("NareshIT");
		thread.start();
	}
}
package com.kiran.MultiThreadingMCQ;

class Test19 extends Thread
{
	
	
	@Override
	public void run() {
		System.out.println("Run");
		super.run();
	}
	
	@Override
	public synchronized void start() {
		System.out.println("Start");
		super.start();
	}	
}
public class MultiThread1
{
	public static void main(String[] args) 
	{
		nit();
	}
	
	static public void nit() 
	{
		Test19 test = new Test19();
		test.start();
	}
}
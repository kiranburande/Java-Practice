package com.kiran.MultiThreadingMCQ;

class Test20 extends Thread
{
	int a;
	public void run() {
		a++;
	}
}
public class MultiThread2
{
	public static void main(String[] args) throws InterruptedException {
		Test20 test = new Test20();
		test.run();
		System.out.println(test.a);
		test.start();
		System.out.println(test.a);
		System.out.println(test.isAlive());
		System.out.println(test.getName());		
	}
}
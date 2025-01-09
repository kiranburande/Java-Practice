package com.kiran.MultiThreadingMCQ;

class Test23 implements Runnable
{
	public void run() {
		Thread thread = Thread.currentThread();
		Thread nit = thread.currentThread();
		System.out.println(nit.getName());		
	}
}
public class MultiThread13
{
	public static void main(String[] args) {
		Test23 nit = new Test23();
		Thread thread = new Thread(nit);
	}
}
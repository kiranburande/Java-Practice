package com.kiran.MultiThreadingMCQ;

class Test21 implements Runnable
{
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getState());
	}
}
public class MultiThread11
{
	public static void main(String[] args) {
		Test21 nit = new Test21();
		nit.run();
	}
}
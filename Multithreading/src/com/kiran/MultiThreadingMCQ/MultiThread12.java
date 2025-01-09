package com.kiran.MultiThreadingMCQ;

class Test22 implements Runnable
{
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		thread.stop();
		System.out.println(thread.getState());
	}
}
public class MultiThread12
{
	public static void main(String[] args) {
		Test22 nit = new Test22();
		nit.run();
	}
}
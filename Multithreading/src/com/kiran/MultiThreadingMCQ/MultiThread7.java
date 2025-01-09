package com.kiran.MultiThreadingMCQ;

public class MultiThread7 implements Runnable
{
	Thread thread;
	public MultiThread7() {
		thread = new Thread(this);
		thread.start();
	}
	public void run() {
		System.out.println(thread);
		
	}	
	public static void main(String[] args) {
		new MultiThread7();
	}
}

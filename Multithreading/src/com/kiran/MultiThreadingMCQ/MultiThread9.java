package com.kiran.MultiThreadingMCQ;

public class MultiThread9 extends Thread
{	
	public static void main(String[] args) {
		MultiThread9 m1 = new MultiThread9();
		MultiThread9 m2 = new MultiThread9();
		MultiThread9 m3 = new MultiThread9();
		m1.start();
		m2.start();
		m3.start();
	}
	
public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

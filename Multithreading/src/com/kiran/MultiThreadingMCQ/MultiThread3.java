package com.kiran.MultiThreadingMCQ;

public class MultiThread3 extends Thread
{
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
	public static void main(String[] args) 
	{
		MultiThread3 nit = new MultiThread3();
		for(int i=0;i<10;i++)
		{
			nit.start();
		}
	}
}
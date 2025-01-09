package com.kiran.MultiThreadingMCQ;

public class MultiThread4 extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			MultiThread4 nit = new MultiThread4();
			nit.start();
		}
	}
}

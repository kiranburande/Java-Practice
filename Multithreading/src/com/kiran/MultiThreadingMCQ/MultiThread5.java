package com.kiran.MultiThreadingMCQ;

public class MultiThread5 extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
	}
	
	@Override
	public void start() {
		System.out.print(Thread.currentThread().getName()+" ");
	}
	
	public static void main(String[] args) {
		MultiThread5 nit = new MultiThread5();
		for(int i=0;i<10;i++)
		{
			nit.start();
		}
	}
}
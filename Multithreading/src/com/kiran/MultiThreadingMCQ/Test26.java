package com.kiran.MultiThreadingMCQ;

public class Test26 extends Thread
{
	public static void main(String[] args) 
	{
		try
		{
			Thread t= new Thread(new Test26 (),"Rahul");
			Thread t1= new Thread(new Test26(),"Ravi");
			t.start(); t1.start();
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	}
	public void run()
	{
		for(int i=0; i<2; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e)
			{
				System.out.println("e2");
			}
			System.out.println(Thread.currentThread().getName()+" ");

		}
	}
}
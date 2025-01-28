package com.kiran.yieldMethodDemo;

class HighPriorityThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
class NormalPriorityThread extends Thread
{
	@Override
	public void run()
	{
		Thread.yield();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	
}
class LowPriorityThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class Test 
{
	public static void main(String[] args) 
	{
		HighPriorityThread highPriorityThread =new HighPriorityThread();
		NormalPriorityThread normalPriorityThread = new NormalPriorityThread();
		LowPriorityThread lowPriorityThread = new LowPriorityThread();
		
		highPriorityThread.setPriority(Thread.MAX_PRIORITY);
		normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
		lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
		
		
		highPriorityThread.start();
		normalPriorityThread.start();
		lowPriorityThread.start();
		
		

	}

}
/*  Question: Thread Priority and yield() Method
Scenario:
You need to understand how thread priority affects execution and how the yield() method works.

Task:

Create three classes HighPriorityThread, LowPriorityThread, and NormalPriorityThread, all extending Thread.
Set their priorities using setPriority(Thread.MAX_PRIORITY), setPriority(Thread.MIN_PRIORITY), and setPriority(Thread.NORM_PRIORITY) respectively.
In each thread’s run() method, print the thread name and current priority.
In the main method, start all three threads and observe the output.
Add a yield() statement in the run() method of NormalPriorityThread to observe its effect.
Key Concepts:

Understanding thread priorities and how they influence scheduling.
Learning how yield() temporarily pauses the current thread to allow others to execute.
Test Cases:

Test Case 1:

Input: Start HighPriorityThread, LowPriorityThread, and NormalPriorityThread.
Expected Output: The high-priority thread should generally run before the others, but exact behavior may vary due to the scheduler.
Test Case 2:

Input: Use yield() in the run() method of NormalPriorityThread.
Expected Output: The normal priority thread yields control, allowing other threads to execute. */
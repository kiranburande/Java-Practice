package com.kiran.MultiThreading;

class ThreadA extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread A Started");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread A Ended");
	}
}

class ThreadB extends Thread
{
	@Override
	public void run()
	{
	
		System.out.println("Thread B Started");
		
		
	}
}

public class Main {

	public static void main(String[] args) throws InterruptedException 
	{
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		a.start();
		a.join();
		b.start();

	}

}
/* Thread States and join() Method
Scenario:
You want to understand the life cycle of a thread, including how to wait for a thread to finish execution using the join() method.

Task:

Create two classes, ThreadA and ThreadB, both extending Thread.
In the run() method of ThreadA, print a message and make it sleep for 2 seconds using Thread.sleep(2000).
In ThreadB, print a message, and after starting ThreadA, call join() on it.
In the main method, start both ThreadA and ThreadB and observe the order of execution.
Key Concepts:

Understanding thread states (NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED).
Using join() to ensure one thread waits for another to complete.
Test Cases:

Test Case 1:

Input: Start ThreadA and ThreadB sequentially.
Expected Output: ThreadB should wait until ThreadA completes its execution, and then continue.
Explanation: join() makes ThreadB wait until ThreadA finishes.
Test Case 2:

Input: Start ThreadB without calling join() on ThreadA.
Expected Output: Both threads may run concurrently, depending on the scheduler.
Explanation: Without join(), ThreadB does not wait for ThreadA. */
package com.kiran.MultiThreadingMCQ;

class Test1
{
    @SuppressWarnings("deprecation")
	public static void main(String []args)
    {
        Thread t = Thread.currentThread();
		System.out.println(t);
        System.out.println("Name of thread  : "+t.getName());
		System.out.println("Id of thread  : "+t.getId());

    } 
}
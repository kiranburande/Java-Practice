package com.kiran.MultiThreadingMCQ;

public class Test11 extends Thread
{
  public static void main(String argv[])
  {
   Test11 b = new Test11();
   b.run();
   b.start();
  } 
  public void start()
  {
    for (int i = 0; i < 10; i++)
    {
       System.out.println("Value of i = " + i); 
    }  
  }
}

package com.kiran.MultiThreadingMCQ;

class Foo1 implements Runnable
{
public void run() 
{
for(int i=0;i<3;i++)
System.out.println("Run by..."+Thread.currentThread().getName()+",i Is "+ i);
}
public void run(String name)
{
System.out.println("This is Second"+name);
}
}
public class Test15
{
   public static void main(String args [])
   {
     Foo1 f = new Foo1();
     Thread t = new Thread(f);
     try 
     {
       System.out.println("Number Will be printt After 500 MiliSecond..");
       for(int j=0;j<5;j++)
       {
        System.out.println("This is j..."+j);
        t.sleep(500);
       }
      }
     catch(InterruptedException e) 
     {
       System.out.println("InterruptedException.."+ e);
       e.printStackTrace();
     }
   }
}

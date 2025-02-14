package com.kiran.Mcq;

import java.util.*;
class Array 
{
  public static void main(String args[]) 
  {
   int array[] = new int [5];
   for (int i = 5; i > 0; i--)
   array[5-i] = i;// 5 4 3 2 1
                  // 5 8 8 8 1
   Arrays.fill(array, 1, 4, 8);
   
   for (int i = 0; i < 5 ; i++)
   System.out.print(array[i]);
  }
}
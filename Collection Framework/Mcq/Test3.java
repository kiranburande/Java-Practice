package com.kiran.Mcq;

import java.util.*;

public class Test3
{
       public static void main(String[] args) 
       {
             List<Number> list = new ArrayList<Number>();
             System.out.format("%b %b %b %d",
                 list.add(7),
                 list.add(null),
                 list.add(7),
                 list.size());
       }
}
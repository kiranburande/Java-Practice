package com.kiran.setInterfaceMCQ;

import java.util.*;

public class Test1
{
       public static void main(String[] args) 
       {
            TreeSet<Integer> times = new TreeSet<Integer>();
            times.add(705);
            times.add(509);
            times.add(645);
            times.add(830);
            times.add(1010);
            times.add(1100);    
            TreeSet<Integer> subset = new TreeSet<Integer>();
            subset =  (TreeSet<Integer>) times.headSet(800);			
            System.out.println(subset);
            System.out.println(subset.first());
            System.out.println(subset.last());

       }
}
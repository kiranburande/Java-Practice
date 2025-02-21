package com.kiran.findDuplicatesInArrayList;
import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<>();
        list1.add(33);
        list1.add(45);
        list1.add(67);
        list1.add(89);
        list1.add(33);
        list1.add(47);
        list1.add(21);
        list1.add(45);
        
        Duplicates duplicates1 = new Duplicates(list1);
        System.out.println("Duplicates: " + duplicates1.getDuplicatesList());
        
        
        List<Integer> list2 = new ArrayList<>();
        list2.add(66);
        list2.add(66);
        list2.add(77);
        list2.add(66);
        list2.add(66);

        Duplicates duplicates2 = new Duplicates(list2);
        System.out.println("Duplicates: " + duplicates2.getDuplicatesList());
        
        List<Integer> list3 = new ArrayList<>();
        Duplicates duplicates3 = new Duplicates(list3);
        System.out.println("Duplicates: " + duplicates3.getDuplicatesList());
        
        Duplicates duplicates4 = new Duplicates(null);
        System.out.println("Duplicates: " + duplicates4.getDuplicatesList());

	}
}

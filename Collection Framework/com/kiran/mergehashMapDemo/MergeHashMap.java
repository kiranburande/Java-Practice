package com.kiran.mergehashMapDemo;

import java.util.*;

public class MergeHashMap 
{
	
	public static void main(String[] args) 
	{
		HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
		hashMap1.put("Apple", 50);
		hashMap1.put("Banana", 30);
		hashMap1.put("Orange", 20);
		
		HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
		hashMap2.put("mango", 40);
		hashMap1.putAll(hashMap2);
		
		System.out.println("After merging fruitInventory2 into fruitInventory:");
		System.out.println(hashMap1);
		
		hashMap1.putIfAbsent("Grapes", 35);
		System.out.println("After using putIfAbsent:");
		System.out.println(hashMap1);
		
		hashMap1.replace("Orange", 25);
		System.out.println("After using replace:");
		System.out.println(hashMap1);
		
		hashMap1.remove("mango", 40);
		System.out.println("After using remove:");
		System.out.println(hashMap1);
		
	}
}/*Ques - 2
-----------

You are tasked with implementing a Java program that demonstrates various operations on HashMap such as merging two HashMap.
Create two HashMap<String, Integer> instances to store fruit names as keys and their quantities as values.
Merge the second HashMap into the first one using the putAll method.
Use the putIfAbsent method to add an entry to the HashMap only if the key is not already present.
Use the replace method to update the value for a specific key.
Use the remove method to delete an entry from the HashMap based on the key.

Example Output :
After merging fruitInventory2 into fruitInventory1:
{Apple=50, Banana=25, Orange=20, Mango=40}

After using putIfAbsent:
{Apple=50, Banana=25, Orange=20, Mango=40, Grapes=35}

After using replace:
{Apple=50, Banana=25, Orange=25, Mango=40, Grapes=35}

After using remove:
{Apple=50, Banana=25, Orange=25, Grapes=35}*/

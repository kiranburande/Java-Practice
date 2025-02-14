package com.kiran.HashMapFruitInventoryManagement;

import java.util.HashMap;

public class FruitInventoryManagement 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
		
		hashMap.put("Apple", 50);
		hashMap.put("Banana", 30);
		hashMap.put("Orange", 20);
		System.out.println("Total number of entries: "+hashMap.size());
		if(hashMap.isEmpty())
		{
			System.out.println("HashMap is empty.");
		}
		else {
			System.out.println("HashMap is not empty.");
		}
		
		System.out.println(hashMap.containsKey("Orange")?"Orange exists in the records.":"Orange does not exists in the records.");
		System.out.println(hashMap.containsKey("Mango")?"Mango exists in the records.":"Mango does not exist in the records.");
		System.out.println(hashMap.containsValue(20)?"Quantity 20 exists in the records.":"Quantity 20 does not exists in the records.");
		System.out.println(hashMap.containsValue(100)?"Quantity 100 exists in the records.":"Quantity 100 does not exist in the records.");
	}

}
/*
 * Ques - 1
-----------
You are tasked with implementing a simple Java program that manages a collection of fruits and their quantities using a HashMap. 
Create a ELC class FruitInventoryManagement :
Add fruits and their quantities to the HashMap.
Display the total number of entries in the HashMap.
Check if the HashMap is empty.
Retrieve and print the quantity of a specific fruit.
Check if a specific fruit exists in the HashMap.
Check if a specific quantity exists in the HashMap.

Sample Output :
Added Apple: 50
Added Banana: 30
Added Orange: 20
Total number of entries: 3
HashMap is not empty.

Quantity for Apple: 50
Quantity for Banana: 30

Orange exists in the records.
Mango does not exist in the records.

Quantity 20 exists in the records.
Quantity 100 does not exist in the records.
*/


package com.kiran.acceptConsumer;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Consumer<String>stringConsumer = x -> 
		{
			System.out.println("Original string: "+x);
			System.out.println("After converting string to uppercase: "+x.toUpperCase());
		};
		Consumer<Integer>integerConsumer = y ->
		{
			System.out.println("Original integer: "+y);
			System.out.println("After squaring the integer: "+y*y);
		};
		
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		System.out.println("Enter the Integer :");
		int n = sc.nextInt(); 
		
		stringConsumer.accept(str);
		integerConsumer.accept(n);
		
	}

}



/* Create a Java program that demonstrates the usage of the Consumer interface to perform various operations on a given integer and string value.
 Your task is to define and use consumers to modify and display these values.

ValueModifier class (ELC) :

Instructions:
Inside the main method, define two consumers:

stringConsumer: Converts the string to uppercase and prints it.
integerConsumer: Squares the integer value and prints it.

Define a sample string value (e.g., "hello") and an integer value (e.g., 3).

Use each consumer to perform the corresponding operation on the sample values and print the results.

Test Cases:
Test Case 1:

Input: "world", 5
Output:
Original string: world
Original integer: 5
After converting string to uppercase: WORLD
After squaring the integer: 25

Test Case 2:
Input: "java", 7
Output:
Original string: java
Original integer: 7
After converting string to uppercase: JAVA
After squaring the integer: 49

Test Case 3:
Input: "example", 4
Output:
Original string: example
Original integer: 4
After converting string to uppercase: EXAMPLE
After squaring the integer: 16 */







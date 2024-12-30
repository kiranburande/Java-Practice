package com.kiran.testPredicate;

import java.util.function.Predicate;

public class NumberTester 
{
	public static void main(String[] args) 
	{
		 
		Predicate<Integer> isEven = n -> n%2==0;
		Predicate<Integer>isPrime = i ->{
			int c = 0;
			for(int j=2;j<i;j++)
			{
				if(i%j == 0)c++;
			}
			 return (c == 0) ;
		};
		int a=20;
		int b=13;
		System.out.println("Is "+a+" Even ? "+ isEven.test(a));
		System.out.println("Is "+b+" Prime ? "+ isPrime.test(b));
		
	}

}

/* Ques - 1
--------------
Create a Java program that demonstrates the usage of the Predicate interface to test if a number is even or prime. Your task is to implement a method
 testPredicate in the NumberTester class that tests a given number against a provided predicate.

NumberTester Class(ELC):

In the main method:
Define two predicates:
isEven: Checks if a given number is even.
isPrime: Checks if a given number is prime.

Define a sample integer number (e.g., 13).

Test each predicate using the testPredicate method and print the result indicating whether the number satisfies each predicate.

Test Cases:

Test Case 1:
Input: 13
Output:
Is 13 even? false
Is 13 prime? true

Test Case 2:
Input: 5
Output:
Is 5 even? false
Is 5 prime? true

Test Case 3:
Input: 20
Output:
Is 20 even? true
Is 20 prime? false */


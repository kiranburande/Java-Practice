package com.kiran.testPredicate;

import java.util.function.Predicate;

public class CalculationLogic 
{
	public static boolean testPredicate(int i, Predicate<Integer> predicate)
	{
		return predicate.test(i);
	}
	public static void main(String[] args) 
	{
		Predicate<Integer> isEven = num -> num%2==0;
		Predicate<Integer> isGreaterThanTen = num -> num > 10;
		Predicate<Integer> isPrime = number ->{ 
			int c = 0;
			for(int i=2;i<number;i++)
				if(number%i ==0)c++;
			return c == 0 ;
		};
		
		// case 1:
		int a = 13;
		System.out.println(a+" is even: "+ isEven.test(a));
		System.out.println(a+" is greater than 10: "+ isGreaterThanTen.test(a));
		System.out.println(a+" is prime: "+isPrime.test(a));
		
		//case 2:
		a=6;
		System.out.println(a+" is even: "+ isEven.test(a));
		System.out.println(a+" is greater than 10: "+ isGreaterThanTen.test(a));
		System.out.println(a+" is prime: "+isPrime.test(a));
		
		//case 3:
				a=17;
				System.out.println(a+" is even: "+ isEven.test(a));
				System.out.println(a+" is greater than 10: "+ isGreaterThanTen.test(a));
				System.out.println(a+" is prime: "+isPrime.test(a));
				
		
	}

}
/* Ques - 1
--------------
Question:

Write a Java program that defines a method testPredicate to test a given number against a provided predicate.
class name CalculationLogic(ELC) :

Method name : testPredicate
Access Modifier : public
Non-Access Modifier : static
return type : boolean
parameters : int, Predicate<Integer>
This method should return a boolean value indicating whether the given number satisfies the provided predicate.


In the main method:
Define three predicates:
isEven: Checks if a given number is even.
isGreaterThanTen: Checks if a given number is greater than 10.
isPrime: ishat it tests the given number against the provided predicate and returns the result.

Define a sample integer number (e.g., 13).
Test each predicate using the testPredicate method and print the result indicating 
whether the number satisfies each predicate.

Test Cases:

Test case 1 : Sample Number (13):
13 is even: false
13 is greater than 10: true
13 is prime: true

Test Case 2:

For number1 = 6:
6 is even: true
6 is greater than 10: false
6 is prime: false

Test Case 3:
For number2 = 17:
17 is even: false
17 is greater than 10: true
17 is prime: true
 */
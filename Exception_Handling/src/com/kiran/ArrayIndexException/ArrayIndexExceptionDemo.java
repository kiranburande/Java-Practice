package com.kiran.ArrayIndexException;

public class ArrayIndexExceptionDemo 
{
	public static void main(String[] args) 
	{
		int a[] = new int[2];
		try {
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
/* 
Ques - 2
-------------
ArrayIndexOutOfBoundException 

a. Write a program to create an ELC class ArrayIndexExceptionDemo which implements main method.

b. Inside main method create an array of int type as follows.

int a[] = new int[2];

c. Now try to print the value of a[3] in the console where handle the Exceptions coming from this line using try catch.

d. In the catch block handle this exception using ArrayIndexOutOfBound Exception and print appropriate message in the console from this Exception.

Test Case 1:

Input:
No input required, just running the program.

Output:
An ArrayIndexOutOfBoundsException occurred.
Message: Index 3 out of bounds for length 2
String representation: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
Stack trace: 
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
    at ArrayIndexExceptionDemo.main(ArrayIndexExceptionDemo.java:8)

Test Case 2:
Input:
1 2

Output:
An ArrayIndexOutOfBoundsException occurred.
Message: Index 3 out of bounds for length 2
String representation: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
Stack trace: 
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
    at ArrayIndexExceptionDemo.main(ArrayIndexExceptionDemo.java:8)   */
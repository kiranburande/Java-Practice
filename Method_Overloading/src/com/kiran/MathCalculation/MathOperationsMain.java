package com.kiran.MathCalculation;

public class MathOperationsMain 
{
	public static void main(String[] args) 
	{
		MathOperations mathOperations = new MathOperations();
		
		System.out.println("Addition of integer :"+mathOperations.add(-10, 20));
		System.out.println("Addition of Double :"+mathOperations.add(10.5, 20.3));
		System.out.println("Multiplication of integer :"+mathOperations.multiply(10,20));
		System.out.println("Multiplication of Double :"+mathOperations.multiply(23.5, 5.5));

	}

}
/* Question - 1
--------------
Write a Java program that defines a MathOperations class with method overloading to perform arithmetic operations. Implement the following methods:

Take a class Calculator(BLC Class)

take 4 public Method :
add(int num1, int num2): Returns the sum of two integers.

add(double num1, double num2): Returns the sum of two doubles.

multiply(int num1, int num2): Returns the product of two integers.

multiply(double num1, double num2): Returns the product of two doubles.

Take an (ELC Class)In the main method, create an instance of MathOperations and demonstrate the use of each method by performing calculations with different types of arguments (integers and doubles).

Test Cases-1 :    Add two doubles
------------------
Sample Input: 10.5, 20.3

Expected Output:

Sum of 10.5 and 20.3 (double): 30.8


Test Cases -2 :
------------------
Multiply two integers

Sample Input: 10, 20

Expected Output:
Product of 10 and 20 (int): 200

Test Case-3 :
----------------
Add with negative integers

Sample Input: -10, 20

Expected Output:

Sum of -10 and 20 (int): 10
 */
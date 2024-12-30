package com.kiran.applyFunction;

import java.util.function.Function;

public class FunctionApplier 
{
	public static int applyFunction(int value, Function<Integer, Integer> function)
	{
		return function.apply(value);
	}
	
	public static void main(String[] args) 
	{
		Function<Integer, Integer> add = value -> value+5;
		Function<Integer, Integer> multiply = value -> value*2;
		Function<Integer, Integer> subtract = value ->  value-3;
		
		// case 1:
		int a= 10;
		System.out.println("Original value: "+a);
		System.out.println("After adding 5: "+add.apply(a));
		System.out.println("After multiplying by 2: "+multiply.apply(a));
		System.out.println("After subtracting 3: "+subtract.apply(a)); 
		
		System.out.println();
		// case 2:
		a=-15;
		System.out.println("Original value: "+a);
		System.out.println("After adding 5: "+add.apply(a));
		System.out.println("After multiplying by 2: "+multiply.apply(a));
		System.out.println("After subtracting 3: "+subtract.apply(a)); 
		
		System.out.println();
		// case 3:
		a=100;
		System.out.println("Original value: "+a);
		System.out.println("After adding 5: "+add.apply(a));
		System.out.println("After multiplying by 2: "+multiply.apply(a));
		System.out.println("After subtracting 3: "+subtract.apply(a)); 
		

	}
	
}

/* Ques - 3
-------------
Question:

Create a Java program that defines a method applyFunction to apply a function to a given integer value. 
The program should include three functions: add, multiply, and subtract, each with different operations. 
Your task is to implement the applyFunction method such that it accepts an integer value and a function as
 parameters, and applies the operation specified by the function to the value.

FunctionApplier class(ELC) :

Method name : applyFunction
Access Modifier : public
Non-Access Modifier : static
return type : int
parameters : int value,  Function<Integer, Integer>
This method should apply the operation specified by the function to the value and return the result.

In the main method:
Define three functions:
add: Adds a given value increment to the input value.
multiply: Multiplies the input value by a given value factor.
subtract: Subtracts a given value decrement from the input value.

Define a sample integer value (e.g., 10).
Test each function using the applyFunction method and print the result after each operation.

Test Case 1:
For sampleValue = 10:

Expected Output :
Original value: 10
After adding 5: 15
After multiplying by 2: 20
After subtracting 3: 7

Test Case 2: 
Negative Value = -15

Expected Output :
Original value: -15
After adding 5: -10
After multiplying by 2: -30
After subtracting 3: -18

Test Case 3: 
Large Value = 100

Expected Output :
Original value: 100
After adding 5: 105
After multiplying by 2: 200
After subtracting 3: 97 */

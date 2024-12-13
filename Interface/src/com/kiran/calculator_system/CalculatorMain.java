package com.kiran.calculator_system;

public class CalculatorMain 
{
	public static void main(String[] args) 
	{
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		simpleCalculator.calculateSum(3,4,5,6);

	}

}

/* 
Question-2
-------------

Design a Caluculator Program

Define an interface Calculator :
 create one abstract method 

Methods :

name 			: calculateSum ()
Return Type  		:void
Arguments Type       :varargs type
Access Modifier 	:public

Take one normal class SimpleCalculator which implements Calculator interface

in this class just implement the overriden method calculateSum and write the specific logic in this method.

Create a Main class named as CalculatorTest nad instantiate the object and call the method for execution.


Test Case-1:

Sum of 1, 2, 3:
Sample Input :1,2,3

Expected Output: "Sum of the numbers: 6"

Test Case-2:
Sum of 10, 20, 30, 40:
Sample Input :(10, 20, 30, 40)
Expected Output: "Sum of the numbers: 100"

Test Case-3:
Sum of 5:
Sample Input :5
Expected Output: "Sum of the numbers: 5"

Test Case-4:

Sample Input :
Expected Output: "Sum of the numbers: 0"


 */



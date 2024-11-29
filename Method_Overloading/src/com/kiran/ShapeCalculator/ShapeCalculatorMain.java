package com.kiran.ShapeCalculator;

public class ShapeCalculatorMain 
{
	public static void main(String[] args) 
	{
		ShapeCalculator shapeCalculator = new ShapeCalculator(); 
		System.out.println("Area of square is :"+shapeCalculator.calculateArea(-5));
		System.out.println("Area of Rectangle is :"+shapeCalculator.calculateArea(-5, 10));
		System.out.println("Area of Circle is :"+shapeCalculator.calculateArea(7.0));
	}

}


/* Question - 2: 
---------------

Write a Java program that defines a ShapeCalculator class with method overloading to calculate the area of geometric shapes. Implement the following methods:


ShapeCalculator - Method overloading


take 4 public Method :

calculateArea(int sideLength): Returns the area of a square (side * side).

calculateArea(int length, int width): Returns the area of a rectangle (length * width).

calculateArea(double radius): Returns the area of a circle (p * radius^2).

Take an Elc class Main  it having main method and execute the methods.

Test Cases -1 :
-------------------
Valid Case: Calculate area of a circle

Sample Input: radius = 7.0

Expected Output:

Area of circle with radius 7.0: 153.93804


Test Cases -2 :
-------------------

Invalid Case: Negative side length for square

Sample Input: sideLength = -5
Expected Output:

Error: Side length must be non-negative.


Test Cases -3 :
-------------------
Invalid Case: Negative length or width for rectangle

Sample Input: length = -5, width = 10

Expected Output:

Error: Length and width must be non-negative. */
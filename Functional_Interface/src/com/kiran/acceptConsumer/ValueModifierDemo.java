package com.kiran.acceptConsumer;


import java.util.function.Consumer;

public class ValueModifierDemo 
{
	public static void modifyValue( int value, Consumer<Integer> consumer) {
		consumer.accept(value);
	}
	
	public static void main(String[] args) 
	{
		Consumer<Integer> doubleValue = value -> System.out.println("After doubling the value: "+value*2);
		Consumer<Integer> incrementBy = value -> System.out.println("After incrementing the value by 3:"+(value+3));
		Consumer<Integer> squareValue = value -> System.out.println("After squaring the value: "+(value*value));
		
		// case 1 :
		int a =5;
		System.out.println("Original value :"+a);
		doubleValue.accept(a);
		incrementBy.accept(a);
		if(a> 0)squareValue.accept(a);
		
		// case 2 :
		a=-8;
		System.out.println("Original value :"+a);
		doubleValue.accept(a);
		incrementBy.accept(a);
		if(a> 0)squareValue.accept(a);
		
		// case 0 :
		a=-8;
		System.out.println("Original value :"+a);
		doubleValue.accept(a);
		incrementBy.accept(a);
		if(a> 0)squareValue.accept(a);
		
	}

}
/* Ques - 2
---------------
Question:

Create a Java program that defines a method modifyValue to perform modifications on an 
integer value using a provided consumer. 
The program should include three consumers: doubleValue, incrementBy, and squareValue, each with
 different modification operations. Your task is to implement 
the modifyValue method such that it accepts an integer value and a consumer as parameters, and applies 
the modification specified by the consumer to the value.

class name  ValueModifier(ELC): 

Define a method modifyValue in the ValueModifier class :
Method name : modifyValue
Access Modifier : public
Non-Access Modifier : static
return type : void
parameters : int value, Consumer<Integer>
This method should apply the operation specified by the consumer to the value.
Implement the modifyValue method such that it applies the operation specified by the consumer to the value.

In the main method:
Define three consumers:
doubleValue: Doubles the value.
incrementBy: Increments the value by a given value increment.
squareValue: Squares the value.

Define a sample integer value (e.g., 5).
Test each consumer using the modifyValue method and print the modified value after each operation.

Example Output:
Original value: 5
After doubling the value: 10
After incrementing the value by 3: 8
After squaring the value: 64

Test Case 1:
For sampleValue = 5:

Expected Output :
Original value: 5
After doubling the value: 10
After incrementing the value by 3: 8
After squaring the value: 25

Test Case 2: 
Negative Value = -8

Expected Output :
Original value: -8
After doubling the value: -16
After incrementing the value by 3: -5

Test Case 3: Zero Value = 0
Expected Output :
Original value: 0
After doubling the value: 0
After incrementing the value by 3: 3 */




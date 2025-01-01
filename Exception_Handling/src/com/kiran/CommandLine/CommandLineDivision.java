package com.kiran.CommandLine;

public class CommandLineDivision 
{
	public static void main(String[] args) 
	{
		try {
			if(args.length != 2)
			{
				throw new IllegalArgumentException();
			}
			
			int dividend = Integer.parseInt(args[0]);
			int divisor = Integer.parseInt(args[1]);
			
			try {
				System.out.println("Division result: "+(dividend/divisor));
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
				
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
		
		finally {
			System.out.println("Division operation completed.");
		}

	}

}

/* Ques - 3
----------
Command Line Division with Exception Handling
Objective:
Write a Java program that processes command line arguments, handles exceptions for invalid inputs and division by zero, and demonstrates 
the use of nested try-catch blocks with a finally block for cleanup.

Instructions:
Create a ELC class named CommandLineDivision.
Implement the main method that:
Checks if exactly two command line arguments are provided.
Parses these arguments into integers (dividend and divisor).
Uses nested try-catch blocks:
Outer block catches IllegalArgumentException for insufficient arguments or invalid input types (NumberFormatException).
Inner block attempts the division and catches ArithmeticException for division by zero.
Prints the result of the division if successful.
Includes a finally block to print "Division operation completed."
Test the program with different scenarios:

Provide valid integers for division.
Test division by zero scenario.
Test with invalid input types (non-integer values).


Test case 1 : Valid Input - Division Result
Command: java CommandLineDivisionQuestion 10 2
Expected Output:
Division result: 5.0
Division operation completed.

Test case 2 : Division by Zero
Command: java CommandLineDivisionQuestion 8 0
Expected Output:
Arithmetic error: / by zero
Division operation completed.

Test case 3 : Invalid Input - Non-integer Argument
Command: java CommandLineDivisionQuestion 12 abc
Expected Output:
NumberFormatException: For input string: "abc"
Division operation completed. */



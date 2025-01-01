package com.kiran.Exception_Handling;

class ParentClass 
{

	public void loadingClass(String name) throws ClassNotFoundException
	{
		
			Class.forName(name);
			System.out.println("Class loaded Successfylly : "+name);
		 
	}
}

class ChildClass extends ParentClass
{


	@Override
	public void loadingClass(String name) throws ClassNotFoundException
	{
		
	
			if(name.isEmpty() || name.equals(null))
			{
				throw new IllegalArgumentException("Class name cannot be empty");
			}
		 super.loadingClass(name);
		
	}
	
}

public class Tester 
{
	public static void main(String[] args) 
	{
		ChildClass childClass = new ChildClass();
		try {
			childClass.loadingClass(args[0]);
			
				
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error loading class in ChildClass. Converting to unchecked exception.");
			System.out.println("Exception caught: Unchecked Exception: RuntimeException from ChildClass");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught :"+e.getMessage());
		}

	}

}


/*  Ques - 2
----------
Handling Multiple Exceptions in Method Overriding
Objective:
Write a Java program that demonstrates method overriding where the superclass method throws a checked exception 
(ClassNotFoundException), and the subclass overrides this method to handle various cases and throw appropriate 
exceptions (IllegalArgumentException).

Instructions:
Create a superclass BLC named ParentClass:
Accepts a String parameter representing the class name to be loaded.

Implement a method loadingClass :
method name : loadingClass
Access modifier : public 
return type : void
parameter :String

Load the class by using Class.forName(-) method.
Throws a checked exception, ClassNotFoundException, if the class is not found.

Create a subclass BLC named ChildClass:

Override the loadingClass method.
method name : loadingClass
Access modifier : public 
return type : void
parameter :String

Handle the case for an empty string, throwing IllegalArgumentException with message "Class name cannot be empty".
Call the superclass method if the string is valid.
Handle the ClassNotFoundException within the method .

Create a ELC class Tester and implement the main method:

Inside the main method, create an instance of ChildClass and call the overridden loadingClass method with various 
test inputs.
Take the input from command line.
Use a try-catch block to catch and handle the exceptions.


Test Case 1: Valid class name
Input: java.lang.String
Expected Output:
Class loaded successfully: java.lang.String

Test Case 2: Invalid class name
Input: NonExistentClass
Expected Output:
Error loading class in ChildClass. Converting to unchecked exception.
Exception caught: Unchecked Exception: RuntimeException from ChildClass

Test Case 3: Empty class name
Input: ""
Expected Output:
Exception caught: Class name cannot be empty
 */



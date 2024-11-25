package com.kiran.Calculation;

class CalculationBase
{
	 int num1;
	 int num2;
	public CalculationBase(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	 
	void performCalculation()
	{
		System.out.println("The Adiition is :"+(this.num1+this.num2));
	}
	
}

class AdvancedCalculation extends CalculationBase
{
	double additionalNum;
	String operation;
	
	public AdvancedCalculation(int num1, int num2, double additionalNum, String operation) {
		super(num1, num2);
		this.additionalNum = additionalNum;
		this.operation = operation;
	}

	void performAdvancedCalculation()
	{
		 System.out.println("Addition of three number is :"+(super.num1+super.num2+this.additionalNum));
	}
	
}

public class CalculationMain {

	public static void main(String[] args) 
	{
		AdvancedCalculation advancedCalculation = new AdvancedCalculation(10,20,30,"Addition");
		advancedCalculation.performCalculation();
		advancedCalculation.performAdvancedCalculation();
	}

}


/*  Program 3 : (Points 10)Single level Inheritance 
----------------------------------------------------------------------------------------------
Consider a scenario where you are designing a class hierarchy to handle basic and advanced calculations.
 The base class, CalculationBase, has two variables, num1 and num2, and a method performCalculation() that adds
 these two numbers. The subclass, AdvancedCalculation, extends the base class, introduces two additional variables,
 additionalNum and operation, and has a method performAdvancedCalculation() that performs a more complex
 operation using all four numbers.

Your task is to implement and test this class hierarchy. Follow the instructions below:

CalculationBase class:

Include two variables, int num1 and int num2.
Implement a default constructor and a parameterized constructor to initialize these variables.
Create a method called performCalculation() that adds num1 and num2 and displays the result.

AdvancedCalculation class:

Extend the CalculationBase class.

Introduce two additional variables, double additionalNum and String operation.

Implement a default constructor and a parameterized constructor to initialize all four variables.

Create a method called performAdvancedCalculation() that uses all four numbers to perform a complex operation.
 Display the result along with the details of the operation.

In the Main class:

Create an instance of the AdvancedCalculation class, setting values for all variables.
Demonstrate the use of the performCalculation() method inherited from the superclass.
Demonstrate the use of the performAdvancedCalculation() method from the subclass.  */
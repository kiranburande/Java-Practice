package com.kiran.zoomanagementsystem;

public class Animal 
{
	private String name;
	private int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void makeSound()
	{
		System.out.println("The animal makes a generic sound.");
	}
	public void displayInfo()
	{
		System.out.println("Name :"+name);
		if(age <= 0 )
		{
			System.out.println("Error Invalid Input.");
		}
		else
		{
			System.out.println("Age :"+age);
		}
		
	}

}

class Lion extends Animal
{
	private int maneLength;

	public Lion(String name, int age, int maneLength) {
		super(name, age);
		this.maneLength = maneLength;
	}
	
	public void makeSound()
	{
		System.out.println("The lion roars loudly.");
	}
	
	public void displayManeLength()
	{
		if(maneLength <= 0 )
		{
			System.out.println("Error Invalid Input.");
		}
		else
		{
			System.out.println("ManeLength :"+maneLength+"cm");
		}
		
	}
}

class Elephant extends Animal
{
	private float tuskLength;

	public Elephant(String name, int age, float tuskLength) {
		super(name, age);
		this.tuskLength = tuskLength;
	}
	
	public void makeSound()
	{
		System.out.println("The elephant trumpets.");
	}
	
	public void displayTuskLength()
	{
		if(tuskLength <= 0 )
		{
			System.out.println("Error Invalid Input.");
		}
		else
		{
			System.out.println("Tusk Length :"+tuskLength+"meters");
		}
		
	}
}










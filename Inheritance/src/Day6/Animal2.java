package com.kiran.Day6;

public class Animal2 
{
	private String name;

	public Animal2(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayDetails()
	{
		System.out.println("Name : "+name);
	}
}

class mammal extends Animal2
{
	private boolean hasFur;

	public mammal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Hasfur : "+hasFur);
	}
	
	
}

class Dog2 extends mammal
{
	private String breed;

	public Dog2(String name, boolean hasFur, String breed) {
		super(name, hasFur);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Breed : "+breed);
	}
	
}








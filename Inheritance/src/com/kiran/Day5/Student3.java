package com.kiran.Day5;

public class Student3 
{
	String name;
	int rollNumber;
	public Student3(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	public void displayDetails()
	{
		System.out.println("Name :"+name);
		System.out.println("Roll Number :"+rollNumber);
	}
	public double calculatePercentage()
	{
		return 0;
	}

}

class ScienceStudent extends Student3
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	public ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		if(physicsMarks <= 0)
		{
			System.out.println("Error Invalid Input");
		}
		else {
			System.out.println("Physics Marks :"+physicsMarks);
		}
		
		if(chemistryMarks <= 0)
		{
			System.out.println("Error Invalid Input");
		}
		else {
			System.out.println("Chemistry Marks :"+chemistryMarks);
		}
		
		if(mathMarks <= 0)
		{
			System.out.println("Error Invalid Input");
		}
		else {
			System.out.println("Math Marks :"+mathMarks);
		}
		
	}
	@Override
	public double calculatePercentage() {
		return (physicsMarks+mathMarks+chemistryMarks)/3;
		
	}
	
	
}

class ArtsStudent extends Student3
{
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;
	public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
		super(name, rollNumber);
		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;
	}
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		if(historyMarks <= 0)
		{
			System.out.println("Error Invalid Input");
		}
		else {
			System.out.println("History Marks :"+historyMarks);
		}
		if(geographyMarks <= 0)
		{
			System.out.println("Error Invalid Input");
		}
		else {
			System.out.println("Geography Marks :"+geographyMarks);
		}
		
		if(englishMarks <= 0)
		{
			System.out.println("Error Invalid Input");
		}
		else {
			System.out.println("English Marks :"+englishMarks);
		}
		
	}
	@Override
	public double calculatePercentage() {
		// TODO Auto-generated method stub
		return (historyMarks+geographyMarks+englishMarks)/3;
	}
	
	
	
}






package com.kiran.University_Staff_Management_System;

class Staff
{
	String name;
	int id;
	public Staff(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	void displayInfo()
	{
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
	}
	
}

class Faculty extends Staff
{
	String department;

	public Faculty(String name, int id, String department) {
		super(name, id);
		this.department = department;
	}
	void teachSubject()
	{
		System.out.println(name+" is teaching.");
	}
}

class Professor extends Faculty
{
	String researchArea;

	public Professor(String name, int id, String department, String researchArea) {
		super(name, id, department);
		this.researchArea = researchArea;
	}
	void conductResearch()
	{
		System.out.println("Research Area :"+researchArea);
	}
	
}


public class UniversityStaffManagementSystem 
{
	public static void main(String[] args) 
	{
		Professor professor = new Professor("Pravin", 102, "Chemistry", "Electrochemistry");
		
		professor.displayInfo();
		professor.teachSubject();
		professor.conductResearch();
	}

}



/*  University Staff Management System
You are tasked with creating a system that models university staff members, with multiple levels of staff positions.
 The system will represent different staff roles and their specific responsibilities.

Class Hierarchy:

Staff Class (Base Class)

Attributes:

String name: Represents the name of the staff member.
int id: Represents the unique ID of the staff member.

Methods:

Constructor to initialize the name and id attributes.

void displayInfo(): Prints the staff member's name and ID.

Faculty Class (Derived from Staff)

Attributes:
String department: Represents the department the faculty member belongs to.

Methods:
Constructor to initialize the name, id, and department.

void teachSubject(): Prints the department the faculty member is teaching.

Professor Class (Derived from Faculty)

Attributes:

String researchArea: Represents the research area of the professor.

Methods:

Constructor to initialize the name, id, department, and researchArea.

void conductResearch(): Prints the research area of the professor.

Task Requirements:

Define the Staff, Faculty, and Professor classes based on the attributes and methods described above.
Create a Main class that instantiates a Professor object with sample values (e.g., name, ID, department, and research area).
Call the methods to demonstrate the functionality of each class.
 */
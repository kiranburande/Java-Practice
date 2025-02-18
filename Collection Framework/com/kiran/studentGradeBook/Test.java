package com.kiran.studentGradeBook;

import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		StudentGradeBook sGradeBook = new StudentGradeBook();
		Scanner sc = new Scanner(System.in);
	    while(true)
	    {
	    	System.out.println("*****Options*****");
	    	System.out.println("1. Add Student Grade");
	    	System.out.println("2. Remove Student Grade");
	    	System.out.println("3. Show All Students");
	    	System.out.println("4. Exit");
	    	System.out.println("Enter your choice:");
	    	int choice = sc.nextInt();sc.nextLine();
	    	switch(choice)
	    	{
	    	case 1:System.out.println("Enter Student Name :");
	    	       String name = sc.nextLine();
	    	       System.out.println("Enter Student Grades :");
	    	       int grade = sc.nextInt();
	    	       sGradeBook.addStudentGrade(name,grade);
	    		break;
	    		
	    	case 2:System.out.println("Enter Student Name To Delete :");
	    	       String name1 = sc.nextLine();
	    	       sGradeBook.removeStudentGrade(name1);
	    		break;
	    	case 3:
	    		System.out.println("Total Students.");
	    		sGradeBook.showAll();
	    	case 4:
	    		System.out.println("Program is stopped...");
	    		System.exit(0);
	    		
	    	default :System.out.println("Invalid Choice...");
	    	}
	    }
	}
}

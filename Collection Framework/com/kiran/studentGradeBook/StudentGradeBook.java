package com.kiran.studentGradeBook;
import java.util.*;
public class StudentGradeBook 
{
	HashMap<String,Integer> hMap = new HashMap<String,Integer>();
	
	public void addStudentGrade(String name,Integer grade)
	{
		hMap.put(name, grade);
		System.out.println("Student Added successfully....");
		
	}
	public void removeStudentGrade(String name)
	{
		if(hMap.isEmpty())
		{
			System.out.println("Student Grade is empty..");
		}
		else {
			hMap.remove(name);
			System.out.println("Student Removed successfully....");
		}
		
	}
	
	public void showAll(){
		hMap.forEach((k,v)->System.out.println(k+ "  "+v));
	}
	
}

package com.kiran.abstract_demo;

abstract class Student 
{
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents;
	public Student() {
		super();
	}
	public Student(String studentName, String studentClass, int totalNoOfStudents) 
	{
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.totalNoOfStudents += totalNoOfStudents;
	}
	
	abstract public int getPercentage();
	
	public static int getTotalNoStudents()
	{
		return totalNoOfStudents;
	}
	
	
	

}

package com.kiran.abstract_demo;

public class ScienceStudent extends Student
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	public ScienceStudent(String studentName, String studentClass, int totalNoOfStudents, int physicsMarks,
			int chemistryMarks, int mathsMarks) 
	{
		super(studentName, studentClass, totalNoOfStudents);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}



	@Override
	public int getPercentage() 
	{
		 if(physicsMarks < 0 || physicsMarks > 100 || chemistryMarks < 0 || chemistryMarks > 100 || mathsMarks < 0 || mathsMarks > 100)
		 {
			 System.err.println("Mark Should in Betweern 0 to 100");
			 System.exit(0);
		 }
		return (physicsMarks+chemistryMarks+mathsMarks)/3;
	}
	
	
	

}

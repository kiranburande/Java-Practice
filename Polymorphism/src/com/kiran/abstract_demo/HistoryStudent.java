package com.kiran.abstract_demo;

public class HistoryStudent extends Student
{
	private int historyMarks;
	private int civicsMarks;
	
	public HistoryStudent(String studentName, String studentClass, int totalNoOfStudents, int historyMarks,
			int civicsMarks) {
		super(studentName, studentClass, totalNoOfStudents);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	public int getPercentage() 
	{
		 if(historyMarks < 0 || historyMarks > 100 || civicsMarks < 0 || civicsMarks > 100 )
		 {
			 System.err.println("Mark Should in Betweern 0 to 100");
			 System.exit(0);
		 }
		return (historyMarks+civicsMarks)/2;
	}
	
	

}

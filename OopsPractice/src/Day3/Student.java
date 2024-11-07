package Day3;

public class Student 
{
	private int studentId;
	private String studentName ;
	private int marks;
	private char grade;
	
	public void setStudentData(int studentId, String studentName, int marks )
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	public void calculateGrade()
	{
		if (marks > 90)
		{
			grade = 'A';
		}
		else if (marks >= 81)
		{
			grade = 'B';
		}
		else if (marks >= 71)
		{
			grade = 'C';
		}
		else if (marks >= 61)
		{
			grade = 'D';
		}
		else 
		{
			grade = 'E';
		}
	}
	
	public void displayDetails()
	{
	System.out.println("Student [ name = "+studentName+", Student Id = "+studentId+", Marks = "+marks+", Grade = "+grade+" ]");
 	}
}

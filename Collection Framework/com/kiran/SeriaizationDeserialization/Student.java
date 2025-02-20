package com.kiran.SeriaizationDeserialization;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Student implements Serializable
{
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private Date dateOfAdmission;
	
	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static Student getStudentObject() throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int sId =Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student Name :");
		String sName = sc.nextLine();
		System.out.println("Enter Student Fees :");
		double sFees = Double.parseDouble(sc.nextLine());
		System.out.println("Enter Student Admission Date(DD/MM/YYYY) :");
		String dob = sc.nextLine();
		DateFormat format = new SimpleDateFormat("dd/mm/yy");
		java.util.Date date = format.parse(dob);
		Date date1 = new java.sql.Date(date.getTime());
		
		return new Student(sId, sName, sFees, date1);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	
}

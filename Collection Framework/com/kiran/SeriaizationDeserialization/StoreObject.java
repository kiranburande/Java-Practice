package com.kiran.SeriaizationDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.*;

public class StoreObject 
{
	public static void main(String[] args) throws IOException, ParseException 
	{
		Scanner sc = new Scanner(System.in);
		var fout = new FileOutputStream("C:\\Users\\dell\\Desktop\\Timepass\\Demo.txt");
		var oos = new ObjectOutputStream(fout);
		
		try(fout;oos;sc;)
		{
			System.out.println("Enter how many student objects want to store :");
			int noOfObjects = Integer.parseInt(sc.nextLine());
			for(int i=1;i<=noOfObjects;i++)
			{
				Student student = Student.getStudentObject(); 
				oos.writeObject(student);
			}
			System.out.println("Object Data Stored Successfully...");
		}
	}
}

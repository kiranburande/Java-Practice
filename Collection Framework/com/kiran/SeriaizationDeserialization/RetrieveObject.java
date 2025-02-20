package com.kiran.SeriaizationDeserialization;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrieveObject 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		var fin = new FileInputStream("C:\\Users\\dell\\Desktop\\Timepass\\Demo.txt");
		var ois = new ObjectInputStream(fin);
		
		try(ois;fin)
		{
			Student student = null;
			while((student = (Student)ois.readObject()) != null)
			{
				System.out.println(student);
			}
		}
		catch(java.io.EOFException e)
		{
			System.err.println("End of file is reached!!!!");
			
		}
	}
}

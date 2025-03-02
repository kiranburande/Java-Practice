package com.kiran.stream_api;

import java.util.List;

record Student(String name, String course)
{
	
}
public class StudentFilter 
{
	public static void main(String[] args) 
	{
		List<Student> students = List.of(new Student("Alice", "Java"),new Student("Bob", "Python"),
				new Student("Charlie", "Java"),new Student("David", "C++"),new Student("Eve", "JavaScript"));
		
	   students.stream().filter(student -> student.course().equals("Java")).map(Student::name).forEach(System.out::println);
		
	   
	   List<Student> students1 = List.of(new Student("Alice", "Python"),new Student("Bob", "Python"),
			   new Student("Charlie", "Python"), new Student("David", "C++"),new Student("Eve", "JavaScript"));
	   
	   students1.stream().filter(student->student.course().equals("Java")).map(Student::name).forEach(System.out::println);
	   
	   
	   List<Student> students2 = List.of(new Student("Alice", "Java"),new Student("Bob", "Java"),
			   new Student("Charlie", "Java"), new Student("David", "Java"),new Student("Eve", "Java"));
	   students2.stream().filter(student->student.course().equals("Java")).map(Student::name).forEach(System.out::println);
	}
}

package com.kiran.Feb2;

import java.util.List;
import java.util.stream.Stream;

record Employee(Integer id,String name)
{
	
}

public class ObjectListConversion 
{
	public static void main(String[] args) 
	{
		List<Employee> listOfEmployees = List.of(new Employee(101,"Scott"),new Employee(102,"Smith"),
				new Employee(103,"Martin"),new Employee(104,"Alex"),new Employee(105,"John"));
		List<String> listOfEmpNames = listOfEmployees.stream().flatMap(emp->Stream.of(emp.name())).toList();
		System.out.println(listOfEmpNames);
	}
}

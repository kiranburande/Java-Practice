package com.kiran.stream_api;

import java.util.List;

record Employee(String name, String id,Double salary)
{
	
}

public class FilterBySalary 
{
	public static void main(String[] args) 
	{
		List<Employee> employees = List.of(new Employee("Alex","A111",40000d),new Employee("Smith","A222",30000d),
				new Employee("Scott","A333",20000d),new Employee("Martin","A444",35000d));
		employees.stream().filter(employee->employee.salary()>30000).map(employee->employee.name()).forEach(System.out::println);
	}
}

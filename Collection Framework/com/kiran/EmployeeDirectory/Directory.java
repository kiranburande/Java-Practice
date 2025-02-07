package com.kiran.EmployeeDirectory;

import java.util.ArrayList;

public class Directory 
{
	ArrayList<Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee e)
	{
		employees.add(e);
	}
	public void displayAllEmployees()
	{
		for(Employee employee : employees)
		{
			System.out.println(employee);
		}
	}
	
	public void updateEmployee(Employee e)
	{
		for(Employee employee : employees)
		{
			if(employee.equals(e)) 
			{
				employee.setName(e.getName());
				employee.setPosition(e.getPosition());
				employee.setSalary(e.getSalary());
			}
		}
	}
	
	public void deleteEmployee(Employee e)
	{
		for(Employee employee:employees)
		{
			if(employee.equals(e))
			{
				employees.remove(employee);
			}
		}
			
	}
}

package com.kiran.employee;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		 Address address = new Address("Hyderabad","Hyderabad","Telangana");
		Employee employee = new Employee(102,"Kiran Burande",address);
		
		System.out.println(employee);
		

	}

}
/* Program: 1
-----------
Create a class Address (Business Logic Class)
Instance Variables: 
   private String cityName;
   private String districtName;
   private String stateName;
Create a parameterized constructor initialize the instance variable of the class.

Override toString() from Object class to print Address class properties.

Create a class Employee (Business Logic Class)
Instance Variables: 
   private int empId;
   private String empName;
   private Address address; //HAS-A relation
Create a parameterized constructor initialize the instance variable of the class.

Override toString() from Object class to print Employee class properties.

Create a class Main (Executable Logic Class) which contains main method to print Employee class
 properties using toString() method. */




package com.kiran.employee_management_system;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeManagement 
{
	private static List<Employee> employees = new ArrayList<>();
	
	private static void addEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name:");
		String name = sc.nextLine();
		System.out.println("Enter Employee gender:");
		String gender = sc.nextLine();
		System.out.println("Enter Employee department:");
		String dept = sc.nextLine();
		System.out.println("Enter Employee salary:");
		String salary = sc.nextLine(); 
		try {
			
			if(Integer.parseInt(salary) < 0 ) {
				System.out.println("Salary Cannot be Nagative..");
				return;
			}
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Error: Salary must be a numeric value.");
			return;
		}
		System.out.println("Enter Employee years of experience:");
		int yearsOfExperience=0;
		try{
			 yearsOfExperience = sc.nextInt();
			if(yearsOfExperience < 0)
			{
				System.out.println(" Years of experience cannot be negative.");
				return;
			}
		}
		catch(NumberFormatException e2)
		{
			System.out.println("Error: Years of experience must be a valid number.");
			return;
		}
		
		employees.add(new Employee(name,gender,dept,salary,yearsOfExperience));	
		System.out.println("Employee added successfully...");			
	}
	
	private static void updateEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index of Employee");
		int index = Integer.parseInt(sc.nextLine());
		if(index<0 || index >= employees.size())
		{
			System.out.println("Error: Employee not found.");
            return;
		}
		System.out.println("Enter new name:");
		String name = sc.nextLine();
		System.out.println("Enter new gender:");
		String gender = sc.nextLine();
		System.out.println("Enter new department:");
		String dept = sc.nextLine();
		System.out.println("Enter new salary:");
		String salary = sc.nextLine(); 
		try {
			
			if(Integer.parseInt(salary) < 0 ) {
				System.out.println("Salary Cannot be Nagative..");
				return;
			}
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Error: Salary must be a numeric value.");
			return;
		}
		System.out.println("Enter new years of experience:");
		int yearsOfExperience = 0;
		try{
			yearsOfExperience = sc.nextInt();
			if(yearsOfExperience < 0)
			{
				System.out.println(" Years of experience cannot be negative.");
				return;
			}
		}
		catch(NumberFormatException e2)
		{
			System.out.println("Error: Years of experience must be a valid number.");
			return;
		}
		Employee e = new Employee(name,gender,dept,salary,yearsOfExperience);
		employees.set(index, e);
		
		System.out.println("Employee updated successfully.");	
	}
	
	private static void removeEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index of Employee");
		int index = Integer.parseInt(sc.nextLine());
		if(index<0 || index >= employees.size())
		{
			System.out.println("Error: Employee not found.");
			return;
		}
		employees.remove(index);
		System.out.println("Employee removed successfully.");
	}
	
	private static void listAllEmployees()
	{
		System.out.println(employees);
	}
	
	private static void sortEmployeesByName()
	{
		List<Employee> list = employees.stream().sorted(Comparator.comparing(Employee::getName)).toList();
		list.forEach(System.out::println);
	}
	
	private static void findHighestSalaryByDepartment()
	{
		 Map<String, Optional<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		Set<Entry<String, Optional<Employee>>> entrySet = collect.entrySet();
		entrySet.forEach(System.out::println);
	}
	
	private static void categorizeAndIncreaseSalary()
	{
		Map<String, Map<String, Optional<Employee>>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary)))));
		Set<Entry<String, Map<String, Optional<Employee>>>> entrySet = collect.entrySet();
		entrySet.forEach(System.out::println);
	}	
	
	public static void main(String[] args) 
	{
		  Scanner scanner = new Scanner(System.in);
		  

	        while (true) {
	            System.out.println("Choose an operation:");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Update Employee");
	            System.out.println("3. Remove Employee");
	            System.out.println("4. List All Employees");
	            System.out.println("5. Sort Employees by Name");
	            System.out.println("6. Find Highest Salary by Department");
	            System.out.println("7. Categorize and Increase Salary");
	            System.out.println("8. Exit");
	            int choice =0;
	            System.out.print("Enter your choice: ");
	            try {
	            	 choice = Integer.parseInt(scanner.nextLine());
	            }
	            catch(NumberFormatException e)
	            {
	            	System.out.println("Invalid Input Please Enter Number...");
	            }

	            switch (choice) {
	                case 1:
	                    addEmployee();
	                    break;
	                case 2:
	                    updateEmployee();
	                    break;
	                case 3:
	                    removeEmployee();
	                    break;
	                case 4:
	                    listAllEmployees();
	                    break;
	                case 5:
	                    sortEmployeesByName();
	                    break;
	                case 6:
	                    findHighestSalaryByDepartment();
	                    break;
	                case 7:
	                    categorizeAndIncreaseSalary();
	                    break;
	                case 8:
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("Invalid choice, try again.");
	            }
	        }
	}
}

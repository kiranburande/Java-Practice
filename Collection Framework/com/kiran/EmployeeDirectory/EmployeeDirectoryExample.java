package com.kiran.EmployeeDirectory;

public class EmployeeDirectoryExample
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Alice", "Manager", 60000);
		Employee e2 = new Employee("Bob", "Developer", 50000);
		
		Directory d = new Directory();
		d.addEmployee(e1);
		d.addEmployee(e2);
		
		d.displayAllEmployees();
		e2.setPosition("Senior Developer");
		d.updateEmployee(e2);
		System.out.println("**********************");
		d.displayAllEmployees();
		d.deleteEmployee(e1);
		System.out.println("**********************");
		d.displayAllEmployees();
		
	}
}

/* program-1
Employee Directory:
Develop an employee directory that stores employee information (name, position, salary) and allows CRUD operations using collections.

Employee Class:
This class represents an employee with attributes like name, position, and salary.
It has a constructor to initialize an employee's details and getters/setters to access and modify these details.
The toString() method is overridden to provide a string representation of an employee's details.

Directory Class:
This class manages a collection of Employee objects using an ArrayList.
The addEmployee() method adds an employee to the directory.
The displayAllEmployees() method prints details of all employees in the directory.
The updateEmployee() method updates an employee's information at a specified index in the directory.
The deleteEmployee() method removes an employee from the directory at a specified index.

EmployeeDirectoryExample Class (Main Class):
This class contains the main() method where an instance of Directory is created.
Two employees, "Alice" and "Bob," are added to the directory with their respective positions and salaries.
The displayAllEmployees() method is called to show all employees.
The details of "Bob" are updated to reflect a change in position and salary.
"Alice" is deleted from the directory.
Finally, the updated list of employees is displayed again.


Output:-
Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Developer', salary=50000.0}

Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Senior Developer', salary=55000.0}

Employee{name='Bob', position='Senior Developer', salary=55000.0}

Initial display after adding "Alice" as a Manager and "Bob" as a Developer.
Display after updating "Bob's" information to reflect the change in position and salary.
Display after deleting "Alice" from the directory.
Final display of the remaining employee, "Bob", with his updated information.
 */

package Day4;

class Person2 
{
	String name;
	int age;
	
	public void displayInfo()
	{
		System.out.println("Person2 [name=" + name + ", age=" + age + "]");
	}

	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	} 
	
	
}

class Employee extends Person2
{
	String employeeId;
	
	public void displayEmployeeInfo()
	{
		super.displayInfo();
		System.out.println("Employee Id :"+employeeId);
	}

	public Employee(String name, int age, String employeeId) {
		super(name, age);
		this.employeeId = employeeId;
	}
	
}

class Manager extends Employee
{
	String department;
	
	public void displayManagerInfo()
	{
		super.displayEmployeeInfo();
		System.out.println("Department Name :"+ department);
	}

	public Manager(String name, int age, String employeeId, String department) {
		super(name, age, employeeId);
		this.department = department;
	}
	
}




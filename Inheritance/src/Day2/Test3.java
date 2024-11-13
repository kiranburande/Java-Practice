package Day2;

class Person {
	  
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void displayDetails()
	{
		System.out.println("Person [name=" + name + ", age=" + age + "]");
	}	
}

class Employee extends Person
{
	double salary;
	
	 

	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}



	void displayEmployeeDetails()
	{
		super.displayDetails();
		System.out.println("Employee [Salary="+salary +"]");
	}


}


public class Test3 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee("Pravin Patil",23,40000.0);
		e.displayEmployeeDetails();
		
	}

}

/* Q3) create base class Person 
Attributes :-

 String name;
    int age;

methods:-

return type :- void
method Name :- displayDetails
behavior of start method:- this method will print the name of the person , age of the person
------
create derived class name as Employee inherit from Person

Attribute:-

double salary;


methods:-

return type :- void
method Name :- displayEmployeeDetails
behavior of displayEmployeeDetails method:- try to call displayDetails method inside this method and print the salary also

------
create main class to test your logic 
create object initialize the values and call the methods
 */
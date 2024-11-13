package Day2;

public class Employee1 {


	String name;
	double salary;
	 
	
	public Employee1(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	void work()
	{
	   System.out.println(name+" is working");	
	}

}

class Manager extends Employee1
{
	String department;

	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}
	void manage()
	{
		System.out.println(name+" is managing "+department+" Department");
	}
}


/* 3)create base class as Employee

 Attribute :-
--------------

string name
double salary


define parametrized constructor to initialize the  instance variable

method:-
---------
return type:-void
method name:- work
behavior:- this method will print the message that along with person name the person is working
"Rajesh is working"


-----------

create derived class name as Manager

 Attribute :-

String department 


define parametrized constructor to initialize the  instance variable
and also parent class properties


method:-
---------
return type:-void
method name:- manage
behavior:- this method will print the person name is managing the department name
"Rajesh is managing sales Department"

------------------------------

define Tester class here use main method to test  your logic

  */

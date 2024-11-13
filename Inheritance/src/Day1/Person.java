package Day1;

class Person 
{
	int hands;
	int legs;
	double height;
	
	public Person(int hands, int legs, double height) {
		this.hands = hands;
		this.legs = legs;
		this.height = height;
	}

	

	public void eat()
	{
		System.out.println("Person is eating.");
	}
	
	public void sleep()
	{
		System.out.println("Person is sleeping.");
	}

}

class Student extends Person
{
	int studentId;
	String studentName;
	
	public Student(int hands, int legs, double height, int studentId, String studentName) {
		super(hands, legs, height);
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public void read()
	{
		System.out.println("student is reading.");
	}
	
	public void write()
	{
		System.out.println("student is writing.");
	}
	
}

class Employee extends Person
{
	int empId;
	String empName;
	
	public Employee(int hands, int legs, double height, int empId, String empName) {
		super(hands, legs, height);
		this.empId = empId;
		this.empName = empName;
	}

	public void taskComplete()
	{
		System.out.println("Employee is completing the task.");
	}
}










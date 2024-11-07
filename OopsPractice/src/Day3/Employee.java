package Day3;

public class Employee 
{
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	public void setEmployeeData(String firstName, String lastName, int employeeId, double salary, int noOfProject)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}
	
	public void calculateSalary()
	{
	   if(noOfProject > 20)
	   {
		   salary = salary + 15000;
	   }
	   else if(noOfProject > 10)
	   {
		   salary = salary + 10000;
	   }
	   else if(noOfProject > 5)
	   {
		   salary = salary + 5000;
	   }
	
	}
	
	public void displayDetails()
	{
		System.out.println("Employee First name : "+firstName);
		System.out.println("Employee Last name : "+lastName);
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee No of Project : "+noOfProject);
		System.out.println("Employee New Salary :"+salary);
		
	}

}
 
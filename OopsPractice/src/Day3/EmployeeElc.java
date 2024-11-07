package Day3;

public class EmployeeElc 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		
		emp.setEmployeeData("Kiran", "Burande", 2524, 40000, 22);
		emp.calculateSalary();
		emp.displayDetails();
	}

}

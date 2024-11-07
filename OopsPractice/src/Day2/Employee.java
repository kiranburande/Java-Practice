package Day2;

public class Employee 
{
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	public void setEmployeeData(int eId, String eName, double eSal)
	{
		employeeId = eId;
		employeeName = eName;
		employeeSalary = eSal;
	}
	
	public void getEmployeeData()
	{
		System.out.println("The Employee Id is : "+employeeId);
		System.out.println("The Employee Name is : "+employeeName);
		System.out.println("The Employee Salary is : "+employeeSalary + "Rs.");
	}

}

/* -----------
Write a Program on OOPs to define Employee class properties and behaviour.

properties :
employeeId : int
employeeName : String
employeeSalary : double

Initialize these properties with the help of Methods using Scanner class not by using Object reference.

behavior:
setEmployeeData() : public void
getEmployeeData() : public void */
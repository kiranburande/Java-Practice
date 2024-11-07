package Day2;

import java.util.Scanner;

public class EmployeeElc 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id :");
		int eid = sc.nextInt();
		
		System.out.println("Enter the Employee Name :");
		// sc.nextLine();
		String ename = sc.nextLine();
		ename = sc.nextLine();
		
		System.out.println("Enter the Employee Salary :");
		double esal = sc.nextDouble();
		 
		e.setEmployeeData(eid, ename, esal);
		e.getEmployeeData();
		
		sc.close();
		
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
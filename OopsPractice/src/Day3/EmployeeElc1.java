
package Day3;

import java.util.Scanner;

public class EmployeeElc1 
{
	public static void main(String[] args) 
	{
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee first name : ");
        String fname = sc.nextLine();
        
        System.out.println("Enter Employee last name : ");
        String lname = sc.nextLine();
        
        System.out.println("Enter Employee Id : ");
        int empid = sc.nextInt();
        
        System.out.println("Enter Employee salary : ");
        int esal = sc.nextInt();
        
        System.out.println("Enter Employee No of projects : ");
        int noproject = sc.nextInt();
        
		emp.setEmployeeData(fname, lname, empid, esal, noproject);
		emp.calculateSalary();
		emp.displayDetails();
		sc.close();
	}

}

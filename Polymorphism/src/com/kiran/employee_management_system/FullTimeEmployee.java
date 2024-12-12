package com.kiran.employee_management_system;

public class FullTimeEmployee implements Employee 
{
	private int employeeId;     	
	private String employeeName;  	
	private double monthlySalary; 	 
	private double benefits; 			
	

	public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthlySalary = monthlySalary;
		this.benefits = benefits;
	}

	@Override
	public double calculateSalary() 
	{
		return this.monthlySalary + this.benefits;
	}

	@Override
	public void generatePayroll() 
	{
		if(monthlySalary < 0 )
		{
			System.err.println("Monthly salary cannot be negative.");
			System.exit(0);
		}
		else if(benefits < 0)
		{
			System.err.println("Benefits cannot be negative.");
			System.exit(0);
		}
		else if(employeeName.equals(null) || employeeName.equals(""))
		{
			System.err.println("Employee name cannot be empty.");
			System.exit(0);
		}
		else 
		{
			System.out.println("  Employee PayRoll Details ");
			System.out.println("-----------------------------");
			System.out.println("Employee Name : "+employeeName);
			System.out.println("Employee Id : "+employeeId);
			System.out.println("Employee Monthly Salary : "+monthlySalary);
			System.out.println("Employee Benefits : "+benefits);
			System.out.println("Employee Total Salary : "+calculateSalary());
		}
		
		
	}

	private boolean employeeName(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

}

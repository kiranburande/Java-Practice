package Day4;

import java.util.Scanner;

public class BankCustomerElc 
{
	public static void main(String[] args) 
	{
		Bank customer = new Bank();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Bank Name : ");
		String bankName = sc.nextLine();
		
		System.out.print("Enter Customer Name : ");
		String bankCustomerName = sc.nextLine();
		
		System.out.print("Enter Bank Address : ");
		String bankAddress = sc.nextLine();
		
		System.out.print("Enter Bank IFSC Code : ");
		String bankIFSCCode = sc.nextLine();
		
		System.out.println("Enter Customer Account Number : ");
		long customerAccountNumber = sc.nextLong();
		
		System.out.print("Enter Current Balance : ");
		int currentBalance = sc.nextInt();
	 
		System.out.println("*********************************************************");
		System.out.println("\t\tWelcome to Banking");
		System.out.println("---------------------------------------------------------");
		System.out.println("1.Withdraw.");
		System.out.println("2.Deposit.");
		System.out.println("3.Current Balance.");
		System.out.println("4.Display Details.");
		
		System.out.print("\t\tEnter your option : ");
		int opt = sc.nextInt();
	
		
		
		customer.setDeatils(bankName, bankCustomerName, bankAddress, bankIFSCCode, customerAccountNumber, currentBalance);
		
		switch(opt)
		{
		   case 1 :
		   {
			   System.out.print("Enter the withdraw amount : ");
			   double w = sc.nextDouble();
			   customer.withdraw(w);
			   break;
		   }
		   case 2: 
		   {
			   System.out.print("Enter the deposit amount : ");
			   double d = sc.nextDouble();
			   customer.deposit(d);
			   break;
		   }
		   case 3:
		   {
			   customer.currentBalance(); 
			   break;
		   }
		   case 4: 
		   {
			   String detail = customer.displayDetails();
			   System.out.println(detail);
			   break;
		   }
		   default : 
		   {
			   System.out.println("Invalid Option");
		   }
		}
		
		
		
	}

}

package Day2;

import java.util.Scanner;

public class ContactElc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Contact con = new Contact();
		
		System.out.print("Enter the contact name :");
		String cname = sc.nextLine();
		
	    System.out.println("Enter the number :");
	    long cnumber = sc.nextLong();
	    
	    System.out.println("Enter Email :");
	    String cmail = sc.nextLine();
	    cmail = sc.nextLine();
	    
	    con.setContact(cname, cnumber, cmail);
		con.getContact();
		sc.close();
	}

}

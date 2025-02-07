package com.kiran.CabCustomerService;

public class CabCustomerServiceTester 
{
	public static void main(String[] args) 
	{
		CabCustomer c1 = new CabCustomer(101,"Kiran","Ameerpet","Madhapur",5,"1234567890");
		CabCustomer c2 = new CabCustomer(101,"Pravin","Ameerpet","Gacchibowli",6,"0011223344");
		CabCustomer c3 = new CabCustomer(101,"Yash","Ameerpet","Hi-tech City",3,"0123401234");
		CabCustomer c4 = new CabCustomer(101,"ABC","Ameerpet","Charminar",8,"1234567890");
		
		CabCustomerService cs = new CabCustomerService();
		
		cs.addCabCustomer(c1);
		cs.addCabCustomer(c2);
		cs.addCabCustomer(c3);
		cs.addCabCustomer(c4);
		
		System.out.println(cs.printBill(c1));
		System.out.println(cs.printBill(c2));
		System.out.println(cs.printBill(c3));
		System.out.println(cs.printBill(c4));
		

	}

}

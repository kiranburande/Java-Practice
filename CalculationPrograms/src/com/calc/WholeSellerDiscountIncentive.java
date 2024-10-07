package com.calc;

public class WholeSellerDiscountIncentive 
{
 public static void main(String[] args) 
{
   int NetBill = Integer.parseInt(args[0]);
   int Total=0 ;
   if( NetBill<5000 ) Total = 5;
   else if( NetBill<10000 ) Total = 10;
   else if( NetBill>=10000 ) Total = 15;
   
   System.out.println("Net Bill :"+NetBill);
   System.out.println("Discount % Applied :"+Total);
   System.out.println("Discount Amount :"+(NetBill*Total/100));
   System.out.println("Payable Amount :"+(NetBill-(NetBill*Total/100)));
}
}



/*
A whole-seller gives incentives in the form of discounts on the net bill. Write a program to input
 the net bill and calculate the discount as follows:

    Net Bill in Rupees			    Discount %
	<5000					           5
	>=5000 and <10000	              10
	>=10000					          15

Display Discount %, Discount Amount and Amount Payable   */
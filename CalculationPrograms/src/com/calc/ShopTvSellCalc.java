package com.calc;

public class ShopTvSellCalc 
{
 public static void main(String[] args) 
{
	 int cp = 32500;
	 int sp = cp+(cp/100*27);
	 float vat = (sp/100*12.7f);
	 float sc = (sp/100*3.87f);
	 
	 System.out.println("Selling Price :"+sp);
	 System.out.println("Vat Charge :"+vat);
	 System.out.println("Service Charge :"+sc);
	 System.out.println("The Total Selling Price of Tv is :"+(sp+vat+sc));
   	
}
}


/*    A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 27%. Apart from this
  a VAT of 12.7% and Service Charge is 3.87% is charged. Display total selling price, profit along with vat and service charge.
 */
    
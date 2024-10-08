package com.calc;

public class ProfitLossInPercentageCalc 
{
 public static void main(String[] args) 
 {
	int cp = Integer.parseInt(args[0]);
	int sp = Integer.parseInt(args[1]);
	
	 if (cp == 0)
	 {
         System.out.println("Cost price cannot be zero.");
         return;
     }
	
	int Profit = sp - cp;
	int Loss = cp - sp;
	
	System.out.println("The cost price :"+cp);
	System.out.println("The selling prince :"+sp);
  
	if(Profit > 0)
	{
		System.out.println("The Profit in percentage is :"+((float)Profit/cp*100));
	}
	else if(Loss > 0)
	{
		System.out.println("The Loss in percentage is :"+((float)Loss/cp*100));
	}
	else {
		System.out.println("No Profit and no Loss in this Deal.");
	}

 }
}




/*
Write a java program to find the profit and loss by following the formula
Profit and loss Formulas – 
Profit = SP – CP
Loss = CP – SP
Profit percentage = (Profit /Cost Price) x 100
Loss percentage = (Loss / Cost price) x 100  */
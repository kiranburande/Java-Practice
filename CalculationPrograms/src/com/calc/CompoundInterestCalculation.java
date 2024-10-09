package com.calc;

public class CompoundInterestCalculation 
{
 public static void main(String[] args) 
 {
    int Principle = Integer.parseInt(args[0]);
    double rate = Double.parseDouble(args[1]);
    double amount=Principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
    
    System.out.println("The total Amount is :"+ String.format("%.2f", amount) );
    System.out.println("The Total Interst is :"+ String.format("%.2f" ,(amount-Principle)));
 }
}


/*
write a Java program to calculate compound interest for 3 years? 
		 Formula- amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100)); */
package com.calc;

public class DaysToYearMonthDays
{
 public static void main(String[] args) 
 {
	int days = Integer.parseInt(args[0]);
	int Years = (days/365);
	int Months = (days%365)/30;
	int Days = ((days%365)%30);
	
	if(Years != 0) System.out.println("Years :"+Years);
	if(Months != 0) System.out.println("Months :"+Months);
    System.out.println("Days :"+Days);
 }
}



/*  
Write a program in java to input number of days. Find and display number of years, months and days. */
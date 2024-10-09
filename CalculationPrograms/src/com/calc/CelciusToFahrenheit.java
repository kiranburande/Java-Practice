package com.calc;

public class CelciusToFahrenheit 
{
	public static void main(String[] args) 
	{
	   double Celcius = Double.parseDouble(args[0]);
	   
	   double Fahrenheit=((9*Celcius)/5)+32;
	   
	   System.out.println("The "+Celcius+" Celcius to Fahrenheit is :"+String.format("%.2f", Fahrenheit)+" Fahrenheit.");
	   
	}
}

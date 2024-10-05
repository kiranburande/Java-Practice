package com.kiran;

public class FahrenheitToCelsiusByCMD 
{
public static void main(String[] args) 
{
   int f = Integer.parseInt(args[0]);
   double cel = ((f-32)*5)/9.0 ;
   
   System.out.println("The "+f+" Fahrenheit to Celcius is :"+String.format("%.2f", cel)+"celcius.");
   
}
}

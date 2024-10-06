package com.kiran;

public class ReverseOf3DigitNoByCMD 
{
public static void main(String[] args) 
{
    int a = Integer.parseInt(args[0]);
    
   
    System.out.println("The 3 Digit Reverse of "+a+" is :"+(a%10)+((a%100)/10)+(a/100));
    
     
}

}
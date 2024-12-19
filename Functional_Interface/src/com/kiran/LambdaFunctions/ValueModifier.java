package com.kiran.LambdaFunctions;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Consumer<String>stringConsumer = x -> 
		{
			System.out.println("Original string: "+x);
			System.out.println("After converting string to uppercase: "+x.toUpperCase());
		};
		Consumer<Integer>integerConsumer = y ->
		{
			System.out.println("Original integer: "+y);
			System.out.println("After squaring the integer: "+y*y);
		};
		
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		System.out.println("Enter the Integer :");
		int n = sc.nextInt(); 
		
		stringConsumer.accept(str);
		integerConsumer.accept(n);
		
	}

}

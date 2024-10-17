package PracticeJava;

import java.util.Scanner;

public class PrintTableByUserInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*num);
		}
		sc.close();
	}

}


/*WAP in java to print table of the given number 
 (Number must be taken from Scanner class)    */
 
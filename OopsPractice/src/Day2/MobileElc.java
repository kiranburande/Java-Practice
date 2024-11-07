package Day2;

import java.util.Scanner;

public class MobileElc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Mobile mob = new Mobile();
		
		System.out.println("Enter the mobile name :");
		String name = sc.nextLine();
		
		System.out.println("Enter the mobile price :");
		int cost = sc.nextInt();
		
		System.out.println("Enter the mobile Ram :");
		int ram = sc.nextInt();
		
		System.out.println("Enter the mobile Rom :");
		int rom = sc.nextInt();
		
		mob.setMobileFeature(name, cost, ram, rom);
		mob.getMobileFeature();
		
	}

}

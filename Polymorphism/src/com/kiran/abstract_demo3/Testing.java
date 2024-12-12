package com.kiran.abstract_demo3;

import java.util.Scanner;

abstract class Food
{
	double proteins;
	double fats;
	double carbs;
	double tastyScore;
	
	
	
	public Food(double proteins, double fats, double carbs, double tastyScore) {
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
		this.tastyScore = tastyScore;
	}



	abstract void getMacroNutrients();
}

class Egg extends Food
{
	int tastyScore= 7 ;
	String type =  "non-vegetarian";
	
	 

	public Egg(double proteins, double fats, double carbs, double tastyScore) {
		super(proteins, fats, carbs, tastyScore);
		 
	}

	@Override
	void getMacroNutrients() 
	{
		System.out.println("An egg has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
		
	}
	
}


class Bread extends Food
{
	int tastyScore = 8;
	String type =  "vegetarian";
	
	public Bread(double proteins, double fats, double carbs, double tastyScore ) {
		super(proteins, fats, carbs, tastyScore);
		 
	}

	@Override
	void getMacroNutrients() 
	{
		System.out.println(" A slice of bread has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
		
	}
	
}


public class Testing
{
	public static void main(String[] args) 
	{
		 int n, numberOfFoodItems;
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Food Menu :");
		 System.out.println("1. Bread");
		 System.out.println("2. Egg");
		 System.out.println("Enter your choice number : ");
		 int choice = sc.nextInt();
		 
		 if(choice == 1)
		 {
			 Egg egg = new Egg(6.2, 5.1,13.8, 0);
	         System.out.println("Egg is "+egg.type);
	         egg.getMacroNutrients();
	         System.out.println("Taste Score: "+egg.tastyScore);
		 }
		 else if(choice == 2)
		 {
			 Bread bread = new Bread(4.0,1.1,13.8,0);
			 System.out.println("Egg is "+bread.type);
	         bread.getMacroNutrients();
	         System.out.println("Taste Score: "+bread.tastyScore);
		 }
		 
		 else 
		 {
			 System.err.println("Invalid Choice");
		 }

	}

}

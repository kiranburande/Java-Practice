package com.kiran.shape;

public class Shape 
{
	

	public Shape() 
	{
		super();
	}
	
	
	
	public static Shape randShape()
	{
		switch ((int) (Math.random()*4))
		{
		case 0:{
			return new Circle();
	     	}
		case 1:{
			
			  return new Square();
	     	}
		case 2:{
			
			  return new Triangle();
	     	}
		  
		   default:{
			System.out.println("Default");
			return new Shape();
		    }
		
		}
		
	}
	public void draw() 
	{
		System.out.println("Shape draw");
	}
	public void erase() 
	{
		System.out.println("Shape erase");
	}
	
	 

}
 

 



package com.kiran.shape;

public class Square extends Shape
{

	public Square() {
		super();
		this.draw();
		this.erase();
	}
	
	@Override
	public void draw() 
	{
		System.out.println("Square draw");
	}
	
	@Override
	public void erase() 
	{
		System.out.println("Square erase");
	}

}

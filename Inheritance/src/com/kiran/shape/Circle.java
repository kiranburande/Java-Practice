package com.kiran.shape;

public class Circle extends Shape 
{
	
	public Circle() {
		super();
		this.draw();
		this.erase();
	}
	
	@Override
	public void draw() 
	{
		System.out.println("Circle draw");
	}
	
	@Override
	public void erase() 
	{
		System.out.println("Circle erase");
	}
}

package com.kiran.shape;

public class Triangle extends Shape
{

	public Triangle() {
		super();
		this.draw();
		this.erase();
	}
	
	@Override
	public void draw() 
	{
		System.out.println("Triangle draw");
	}
	
	@Override
	public void erase() 
	{
		System.out.println("Triangle erase");
	}

}

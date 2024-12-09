package com.kiran.abstract_demo1;

public class MyBook extends Book 
{

	@Override
	void setTitle(String title) 
	{
		 super.title = title;
	}

	@Override
	public String getTitle() {
		 
		return "The title of my book is: "+super.getTitle();
	}
	
	
}

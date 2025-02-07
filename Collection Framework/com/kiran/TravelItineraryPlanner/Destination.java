package com.kiran.TravelItineraryPlanner;

import java.util.*;

public class Destination 
{
	private String name;
	List<Activity> list;
	
	public Destination(String name) {
		super();
		this.name = name;
		this.list  = new ArrayList<>();
	}
	
	public void addActivity(Activity act)
	{
		list.add(act);
	}	
	
	public List<Activity> retrieveAllActivity()
	{
		return list;
	}

	@Override
	public String toString() {
		return "Destination [name=" + name + ", list=" + list + "]";
	}
	
}

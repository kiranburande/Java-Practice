package com.kiran.TravelItineraryPlanner;

import java.util.ArrayList;
import java.util.List;

public class ItineraryPlanner {

	private List<Destination> destinations;

	public ItineraryPlanner() {
		super();
		this.destinations = new ArrayList<>();
	}
	
	public void addDestination(Destination des) {
		destinations.add(des);
	}
	
	public List<Destination> retrieveDestination()
	{
		return destinations;
	}
}

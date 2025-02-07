package com.kiran.TravelItineraryPlanner;

public class TravelItineraryPlanner 
{
	public static void main(String[] args) 
	{
		Activity act1 = new Activity("Visit Eiffel Tower","(Morning)");
		Activity act2 = new Activity("Louvre Museum","(Afternoon)");
		Activity act3 = new Activity("British Museum","(Morning)");
		Activity act4 = new Activity("London Eye","(Afternoon)");
		
		Destination paris = new Destination("Paris");
		Destination london = new Destination("London");
		
		paris.addActivity(act1);
		paris.addActivity(act2);
		london.addActivity(act3);
		london.addActivity(act4);
		
		ItineraryPlanner itineraryPlanner = new ItineraryPlanner();
		itineraryPlanner.addDestination(paris);
		itineraryPlanner.addDestination(london);
		//System.out.println(itineraryPlanner.retrieveDestination());
		
		System.out.println("Destination: "+itineraryPlanner.retrieveDestination().get(0));
		System.out.println("Destination: "+itineraryPlanner.retrieveDestination().get(1));
		
	}

}


/*
 Program-2
Travel Itinerary Planner:
Build a travel itinerary planner that organizes destinations, activities, and schedules for travelers using collections.

Activity:
Represents an activity with a name and schedule.
Contains a constructor to initialize the activity's details and getters to access these details.
Overrides the toString() method to provide a string representation of an activity.

Destination:
Represents a destination with a name and a list of activities.
Has a constructor to set the destination's name and initialize an empty list of activities.
Provides methods to add activities to the destination and retrieve the list of activities.
Overrides the toString() method to provide a string representation of a destination.

ItineraryPlanner:
Manages a list of destinations.
Contains methods to add destinations and retrieve the list of destinations.

TravelItineraryPlanner (Main Class):
Creates an instance of ItineraryPlanner.
Creates two Destination objects: "Paris" and "London".
Adds activities to each destination.
Adds these destinations to the itinerary planner.
Displays the itinerary by listing destinations and their respective activities.


Output:-
Destination: Paris
- Visit Eiffel Tower (Morning)
- Louvre Museum (Afternoon)

Destination: London
- British Museum (Morning)
- London Eye (Afternoon)*/





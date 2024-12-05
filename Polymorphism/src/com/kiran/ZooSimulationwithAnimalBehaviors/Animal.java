package com.kiran.ZooSimulationwithAnimalBehaviors;

public class Animal 
{
	String species ;

	public Animal(String species) {
		super();
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}
	public void makeSound()
	{
		System.out.println("generic animal sound.");
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + "]";
	}
	
	public Animal reproduce()
	{
		System.out.println("Generic reproduction method for all animals.");
		return  new Animal("Unknown");
	}

}

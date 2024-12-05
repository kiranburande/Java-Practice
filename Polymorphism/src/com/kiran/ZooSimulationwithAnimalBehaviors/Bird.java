package com.kiran.ZooSimulationwithAnimalBehaviors;

public class Bird extends Animal 
{
	boolean canFly;

	public Bird(String species, boolean canFly) {
		super(species);
		this.canFly = canFly;
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		super.makeSound();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public Bird reproduce() {
		System.out.println("Birds lay eggs as a means of reproduction.");
		return  new Bird(species,canFly);
	}
	
	public void buildNest()
	{
		System.out.println("birds building nests for their eggs.");
	}
	

}

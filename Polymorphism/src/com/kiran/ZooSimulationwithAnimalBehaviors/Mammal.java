package com.kiran.ZooSimulationwithAnimalBehaviors;

public class Mammal extends Animal 
{
	boolean hasFur;

	public Mammal(String species, boolean hasFur) {
		super(species);
		this.hasFur = hasFur;
	}

	@Override
	public void makeSound() {
		 
		super.makeSound();
	}

	@Override
	public String toString() {
		 
		return super.toString();
	}

	@Override
	public Mammal reproduce() {
		 
		System.out.println("Mammals give birth to live young.");
		return  new Mammal(species, hasFur);
	}
	
	public void nurseYoung()
	{
		System.out.println("mammals nursing their young.");
	}

}

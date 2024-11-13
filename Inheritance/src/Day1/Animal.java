package Day1;

public class Animal 
{
	double height;
	int age;
	
	public Animal(double height, int age) {
		super();
		this.height = height;
		this.age = age;
	}

	public void sleep()
	{
		System.out.println("Animal is sleeping.");
	}
	
	public void eat()
	{
		System.out.println("Animal is eating.");
	}

}

class Dog extends Animal
{
	String petName;
	
	public Dog(double height, int age, String petName) {
		super(height, age);
		this.petName = petName;
	}

	public void bark()
	{
		System.out.println("Dog is barking.");
	}
}

class Lion extends Animal
{
	
	public Lion(double height, int age) {
		super(height, age);
	}

	public void roar()
	{
		System.out.println("Lion is roaring.");
	}
}
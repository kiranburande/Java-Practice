package com.kiran.PetrolPumpSimulation;

class PetrolPump 
{
	// method to simulate refill the car
	public synchronized void refillCar(String carName)
	{
		System.out.println(carName+" started refilling..."); // fuel filling started
		try {
			Thread.sleep(3000);   // thread goes for waiting state to simulate
		}
		// if there interrupted exception will create this block is going to handle
		catch(InterruptedException e)
		{
			e.printStackTrace();  
		}
		System.out.println(carName+" completed refilling!"); // fuel filling ended
	}
}

class Car implements Runnable
{
	String name;  //The name of the car
	PetrolPump petrolPump;  //A reference to the petrol pump
	
	
	
	public Car(String name, PetrolPump petrolPump) {
		super();
		this.name = name;
		this.petrolPump = petrolPump;
	}



	@Override
	public void run()  // implemented method from Runnable interface
	{
		petrolPump.refillCar(name);  // call to petrolpump refill method by petrolPump var 
	}
}


public class PetrolPumpSimulation 
{
	public static void main(String[] args) 
	{
		PetrolPump petrolPump = new PetrolPump();
		
		Car cars[] = {new Car("Swift",petrolPump), new Car("Thar",petrolPump), new Car("Fortuner",petrolPump) };
		
		Thread threads[] = new Thread[cars.length];
		
		for(int i=0;i<threads.length;i++)
		{
			threads[i] = new Thread(cars[i]);
		}
		
		for(Thread thread : threads)
		{
			thread.start();
		}
		
	}
}
/* Ques - 1
--------------
Your task is to create a Java program that simulates a scenario where multiple cars arrive at a petrol pump for 
refilling. The program should utilize multithreading concepts with synchronization to manage concurrent refilling
operations at the petrol pump.The main goal is to observe and record which car completes the refilling process first.

Instructions:

PetrolPump Class:

Create a PetrolPump class with the following attribute and method:
refillCar(String carName): A synchronized method simulating the refilling process. Ensure that only one car can execute this method at a time.
Simulation Details:
In the refillCar method, print messages to indicate when a car starts and completes refilling.
 Use the format: <CarName> started refilling... and <CarName> completed refilling!.
Implement a sleep period in the refillCar method (e.g., Thread.sleep(3000)) to simulate the time it takes for a car to refill.

Car Class:

Create a Car class that implements the Runnable interface. Include the following members:
name (String): The name of the car.
petrolPump (PetrolPump): A reference to the petrol pump.
run(): Implement the run method from the Runnable interface. Inside this method, call the refillCar method of the petrol pump to simulate the refilling process.

PetrolPumpSimulation Class (Main):

In the main method, create an instance of PetrolPump.
Create an array of Car objects, each initialized with a unique name and the reference to the petrol pump.
Create an array of Thread objects to represent each car's thread.
Start each car thread and wait for all car threads to complete using the join method.


Notes:

Use the synchronized keyword to achieve synchronization without using Semaphore.
Ensure proper exception handling for InterruptedException.
Your implementation should be well-documented with comments explaining the logic of each class and method.
Adjust the sleep time and other parameters based on your desired simulation.  */
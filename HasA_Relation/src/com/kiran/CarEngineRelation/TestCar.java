package com.kiran.CarEngineRelation;

public class TestCar {
	public static void main(String[] args) 
	{
		Engine engine = new Engine("V6 Hybrid");
		Car car = new Car("Hyundai", "Camry", engine);
		 System.out.println(car);
		
	}

}


/* Que 1 : Car Has A Engine 
========================

Create the Engine Class
-----------------------
A class to represent an engine with a model attribute.
Variable Declaration:
private String model; — This variable stores the model of the engine.

Constructor Declaration
public Engine(String model) — A constructor that initializes the engine model.

Getter Method Declaration:
public String getModel() — A method to get the engine model.

toString Method Declaration:
@Override public String toString() — A method to return a string representation of 
the engine.


Create the Car Class
--------------------
A class to represent a car with make, model, and an engine.
Variable Declarations:

private String make; — This variable stores the make of the car.
private String model; — This variable stores the model of the car.
private Engine engine; — This variable stores the engine object of the car.

Constructor Declaration:
public Car(String make, String model, Engine engine) — A constructor that initializes the car's make, model, and engine.

toString Method Declaration:
@Override public String toString() — A method to return a string representation of the car.


Create TestCar class
---------------------
-> Create main method 
-> Create an engine object.
-> Create a car object that includes the engine.
-> Display the car's information.


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input


TEST CASE 2:
------------
sample input  :
                Engine engine = new Engine("V6 Hybrid");
                Car car = new Car("Hyundai", "Camry", engine);
                System.out.println(car);

sample output : Car Make: Hyundai, Model: Camry, Engine Model: V6 Hybrid */
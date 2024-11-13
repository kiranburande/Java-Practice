package Day2;

class Vehicle
{
	String brand;
	int year;

	public Vehicle(String brand, int year) {
		super();
		this.brand = brand;
		this.year = year;
	}

	void start()
	{
		System.out.println("The vehicle is starting.");
	}
}

class Car extends Vehicle
{
	String model;
	
	

	public Car(String brand, int year, String model) {
		super(brand, year);
		this.model = model;
	}



	void displayCarDetails()
	{
		System.out.println("Car [model=" + model + ", brand=" + brand + ", year=" + year + "]");
	}
	 
}

public class Test2 {
	public static void main(String[] args) 
	{
		Car c1 = new Car("Maruti",2021,"Swift Dezire");
		c1.displayCarDetails();
	}

}



/*create base class Vehicle 
with its attributes
String brand
int year

methods:-

return type :- void
method Name :- start
behavior of start method:- this method will print the message that " The vehicle is starting."
------
create derived class name as car inherit from vehicle

Attribute:-

String model


methods:-

return type :- void
method Name :- displayCarDetails
behavior of displayCarDetails method:- this method will print the brand, year,model

------
create main class to test your logic 
create object initialize the values and call the methods
*/
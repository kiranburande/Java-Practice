package Day2;

public class Shape
{
	String color;

	public Shape(String color) {
		super();
		this.color = color;
	}
	void displayColor()
	{
		System.out.println("Shape [color=" + color + "]");
	}
	 

}

class Circle extends Shape 
{
	double radius ;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	double area()
	{
		return 3.14*radius*radius;
	}
	
}

/*  2)create base class as Shape

 Attribute :-
--------------

string color


define parametrized constructor to initialize the  instance variable

method:-
---------
return type:-void
method name:- displayColor
behavior:- this method will print the color of a shape

-----------

create derived class name as Circle

 Attribute :-

double radius 


define parametrized constructor to initialize the  instance variable
and also parent class properties


method:-

method:-
---------
return type:-double
method name:- area
behavior:- this method will calculate the area of circle and return the area

------------------------------

define Tester class here use main method to test  your logic
  */
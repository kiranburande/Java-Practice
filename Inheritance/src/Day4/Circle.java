package Day4;

public class Circle 
{
	double radius;
	public Circle() 
	{
	   this.radius = 0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getArea()
	{
		if(radius < 0)
		{
			return -1;
		}
		else
		{
			return 3.14*radius*radius;
		}
		
	}

}

class Cylinder extends Circle 
{
	double height;
	
	public Cylinder()
	{
		this.height = 0;
	}

	

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}



	public double getVolume()
	{
		if(height < 0)
		{
			return -1;
		}
		
		else 
		{
			return 3.14*radius*radius*height;
		}
	}	
	
}









package Day1;

public class Bike 
{
	String name;
	double engine;
	int maxspeed;
	
	public void bikeInfo()
	{
		System.out.println("Bike name is :"+name);
		System.out.println("Bike engine capacity is :"+engine+"cc.");
		System.out.println("Bike maximum speed is :"+maxspeed+" km/ph");
	}
	public void run()
	{
		System.out.println(name+" bike runs very fastly.");
	}

}

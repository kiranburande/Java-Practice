package Day1;

public class BikeElc 
{
	public static void main(String[] args) 
	{
		Bike shine = new Bike();
		
		shine.name = "CB Shine";
		shine.engine = 125;
		shine.maxspeed = 140;
		
		shine.bikeInfo();
		shine.run();
		
	}

}

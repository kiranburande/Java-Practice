package Day1;

public class FanElc 
{
	public static void main(String[] args) 
	{
		Fan orient = new Fan();
		
		orient.name = "Orient Fan";
		orient.coil = "3 layer coil";
		orient.wing = 4;
		
		
		orient.switchOn();
		orient.switchOff();
	}

}

package Day4;

public class CircleMain {

	public static void main(String[] args) 
	{
		 Cylinder c = new Cylinder(5,5);
		 
		 double volume = c.getVolume();
		 double area = c.getArea();
		 
		 if(area <= 0)
		 {
			 System.out.println("Error Invalid Input");
		 }
		 else {
			 System.out.println("Volume = "+c.getVolume());
		 }
		 if(volume <= 0)
		 {
			 System.out.println("Error Invalid Input");
		 }
		 else {
			 System.out.println("Area = "+c.getArea());
		 }
		 

	}

}

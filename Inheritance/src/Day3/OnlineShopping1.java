package Day3;

public class OnlineShopping1 {

	public static void main(String[] args) 
	{
		Electronics e1 = new Electronics("Laptop",40000,"Dell");
		Product1 e2 =e1;
		Clothing c1 = new Clothing("T-shirt",4000,"Medium");
		
		System.out.println(e1.name);
		System.out.println(e1.price);
		System.out.println(e1.calculateTotalCost(2));
		e1.displayInfo();
		e2.displayInfo();
		
		System.out.println();
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.calculateTotalCost(3));
		c1.displayInfo();
		
	}
	

}

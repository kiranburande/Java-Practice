package Day3;

public class Product1 
{
	protected String name;
	protected double price;
	
	public Product1(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public double calculateTotalCost(int quantity)
	{
		return price*quantity;
	}
	
	 static public void displayInfo()
	{
		 System.out.println("khjsd");
//		System.out.println("Product1 [name=" + name + ", price=" + price + "]");
	}
	 
	 
}

class Electronics extends Product1
{
	private String brand;

	public Electronics(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}
	 
	static public void displayInfo() {
		// TODO Auto-generated method stub
		//super.displayInfo();
		//System.out.println( "Electronics [brand=" + brand + "]");
		System.out.println("djghj");
	}
	 
	
}

class Clothing extends Product1
{
	private String size;

	public Clothing(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}
	

	 
	static public void displayInfo() {
		// TODO Auto-generated method stub
//		super.displayInfo();
//		System.out.println("Clothing [size=" + size + "]");
		System.out.println("KJKJS");
	}
	
}



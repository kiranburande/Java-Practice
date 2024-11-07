package Day2;

public class Mobile 
{
	String mname;
	int mprice;
	int mram;
	int mrom;
	
	public void setMobileFeature(String name, int cost, int Ram, int Rom)
	{
		mname = name;
		mprice = cost;
		mram = Ram;
		mrom = Rom;
	}
	
	public void getMobileFeature()
	{
		System.out.println("Mobile Brand is :"+mname);
		System.out.println("Mobile Price is :Rs."+mprice);
		System.out.println("Mobile Ram is :"+mram+" Gb");
		System.out.println("Mobile Rom is :"+mrom+" Gb");
	}

}

package Day2;

public class Product 
{
	int productId ;
	String productName;
	double productPrice;
	
	public void setProductInfo(int proId, String proName, double proPrice)
	{
		productId = proId;
		productName = proName;
		productPrice = proPrice;
		
	}
	
	public void getProductInfo()
	{
		System.out.println("The product Id is :"+productId);
		System.out.println("The product name is :"+productName);
		System.out.println("The product price is :"+productPrice);
	}

}

/* Write a Program on OOPs to define Product class properties and behaviour.

properties :
productId : int
productName : String
productPrice : double

Initialize these properties with the help of Methods using Scanner class not by using Object reference.

behavior:
setProductData() : public void
getProductInfo() : public void */
package Day2;

import java.util.Scanner;

public class ProductElc 
{
	public static void main(String[] args) 
	{
		Product p = new Product();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product id :");
		int proid = sc.nextInt();
		
		System.out.println("Enter the product name :");
		// sc.nextLine();
		String proname = sc.nextLine();
		proname = sc.nextLine();
		
		System.out.println("Enter the product price :");
		double proprice = sc.nextDouble();
		
		
		p.setProductInfo ( proid, proname, proprice);
		p.getProductInfo();
		sc.close();
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
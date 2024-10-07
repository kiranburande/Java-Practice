 

package com.kiran;

public class DominosBill 
{
public static void main(String[] args)
{
	int cr = 4;
	int pcr = 60;
	int vp = 3;
	int pvp = 25;
	int totalBill = cr*pcr+vp*pvp;
	
	System.out.println("The Total Bill is :"+ (totalBill - 50) );
}
}

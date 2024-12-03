package com.kiran.ambiguitymcqs;

class Test
{		    
	public void accept(int b, int i) {
		System.out.println("int-int");
	}
	public void accept(Byte i, int b) {
		System.out.println("byte-int");
	}
	public void accept(Byte b1 , byte b2) {
		System.out.println("Byte-byte");
	}
}
public class AmbiguityDemo10
{
	public static void main(String[] args) 
	{
		Test t1 = new Test(); 
		byte b1 = 1;
		byte b2 = 2;
		t1.accept(b1, b2);
	}
}
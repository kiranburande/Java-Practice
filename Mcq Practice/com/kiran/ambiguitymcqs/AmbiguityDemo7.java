package com.kiran.ambiguitymcqs;


class Test7
{		    
	public void accept(byte b, int i) {
		System.out.println("byte-int");
	}
	public void accept(int i, byte b) {
		System.out.println("int-byte");
	}
}
public class AmbiguityDemo7
{
	public static void main(String[] args) 
	{
		Test7 t1 = new Test7();  
		//t1.accept(1, 2);   // here ambiguity issue occurs jvm get confused 

	}

}
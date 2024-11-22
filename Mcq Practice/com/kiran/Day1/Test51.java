package Day1;

public class Test51 {

	//int x = 10;   // compilation error
	static int x = 10; 
	public static void main(String[] args) 
	{ 
		System.out.println(x); 
	} 
	static
	{ 
		System.out.print(x + " "); 
	}
}

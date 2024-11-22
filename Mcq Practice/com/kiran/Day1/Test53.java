package Day1;

public class Test53 {

	int x = 10; 
	public static void main(String[] args) 
	{ 
	//	System.out.println(Test53.x); // compilation error non static variable cannot be accessed with static context
	} 
	static
	{ 
		int x = 20; 
		System.out.print(x + " "); 
	} 
}

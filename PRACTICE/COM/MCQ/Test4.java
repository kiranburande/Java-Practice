package COM.MCQ;

public class Test4 
{
	public static void main(String[] args) 
	{
		if((call(3)) ||(call(7)))
		{
			System.out.println("Result is true");			
		}
		if((call(6)) ||(call(9)))
		{
			System.out.println("Result is true");			
		}
	}
	public static boolean call(int i)
	{
		if(i<5)
		{
			System.out.println("i < 5");
			return true;
		}
		else
		{
			System.out.println("i>=5");
			return false;
		}
	}

}

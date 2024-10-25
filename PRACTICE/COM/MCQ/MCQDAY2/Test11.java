package COM.MCQDAY2;

public class Test11 
{
	public static void main(String[] argv)
    {
      //   long  x = 400;   we cant use long in switch 
		int x = 400;   // corrected 
         switch( x ) 
         {
                case 100 : System.out.println("One hundred");break ;
                case 200 : System.out.println("Two hundred");break ;
                case 400 : System.out.println("Three hundred");break ;
        }
    }

}

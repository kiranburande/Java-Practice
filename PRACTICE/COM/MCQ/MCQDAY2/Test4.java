package COM.MCQDAY2;

public class Test4 
{
	public static void main(String[] args)
    {
        byte b =(byte)(2);        
        switch(b)
        {    case 23:
          //  case 128:      this case create error beacause byte limit is -128 to 127
            case (byte)128:   // this is possible by explicit type casting
        }        
    }

}

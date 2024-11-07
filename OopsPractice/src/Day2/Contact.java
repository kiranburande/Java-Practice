package Day2;

public class Contact 
{
	String contactName;
	long contactNumber;
	String contactEmail;
	
	public void setContact(String cName, long cNumber, String cmail)
	{
		contactName = cName;
		contactNumber = cNumber;
		contactEmail = cmail;
		
	}
	
	public void getContact()
	{
		System.out.println("The Contact name :"+contactName);
		System.out.println("The Contact number :"+contactNumber);
		System.out.println("The contact email :"+contactEmail);
	}

}

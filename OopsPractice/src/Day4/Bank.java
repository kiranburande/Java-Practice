package Day4;

public class Bank 
{
	private String bankName;
	private String bankCustomerName;
	private String bankAddress;
	private String bankIFSCCode;
	private long customerAccountNumber ; 
	private int currentBalance;
	
	public void setDeatils(String bankName, String bankCustomerName, String bankAddress, String bankIFSCCode, long customerAccountNumber, int currentBalance)
	{
		this.bankName = bankName;
		this.bankCustomerName = bankCustomerName;
		this.bankAddress = bankAddress;
		this.bankIFSCCode = bankIFSCCode;
		this.customerAccountNumber = customerAccountNumber;
		this.currentBalance = currentBalance;
	}
	
	public void withdraw(double amount)
	{
		if(currentBalance <= 1000)
		{
			System.out.println("InsufficientBalance.");
		}
			
	    else if((currentBalance-amount) >= 1000)
		{
			currentBalance-=amount;
			System.out.println("Transaction Successful.");
			System.out.println("Available Balance : Rs."+currentBalance);
		}
		else 
		{
			System.out.println("Maintain Minimum Balance Rs.1000.");
		}
		return;
	}
	
	public void deposit(double amount)
	{
		currentBalance+=amount;
		System.out.println("Deposited Succesfully.");
		System.out.println("Available Balance : Rs."+currentBalance);
		return;
	}
	
	public void currentBalance()
	{
		System.out.println("Your Current balance is : "+currentBalance);
		return;
	}
	
	public String displayDetails()
	{
		return "["+bankName+", Name :"+bankCustomerName+", Adress :"+bankAddress+", IFSC :"+bankIFSCCode+", Acc no :"+customerAccountNumber+", Balance :"+currentBalance+"]";
	}

}

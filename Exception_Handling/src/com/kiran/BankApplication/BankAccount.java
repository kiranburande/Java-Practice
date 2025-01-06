package com.kiran.BankApplication;

public class BankAccount implements Bank
{
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	@Override
	public void deposit(double amount) 
	{
		if(amount <= 0)
		{
			throw new InvalidAmountException("You Cannot Deposit Negative or Zero Amount.");
		}
		else {
			balance += amount;
			System.out.println("Transaction Successful...");
			System.out.println("Your Balance is :"+balance);
		}
		
	}
	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException
	{
		if(balance < amount)
		{
			throw new InsufficientFundsException("Insufficient Funds...");
		}
		else if(amount <= 0)
		{
			throw new InvalidAmountException("You Cannot Withdraw Negative or Zero Amount.");
		}
		else {
			balance -= amount;
			System.out.println("Transaction Successful...");
			System.out.println("Your Current Balance is :"+balance);
		}
	}
	@Override
	public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException 
	{
		if(amount > balance)
		{
			throw new InsufficientFundsException("Insufficient Funds...");
		}
		else if(toAccount.equals(null) || toAccount.equals(""))
		{
			throw new AccountNotFoundException("Given Account is not found Please try Again...");
		}
		else if(amount <= 0)
		{
			throw new InvalidAmountException("You Cannot Transfer Negative or Zero Amount.");
		}
		else {
			balance -= amount;
			System.out.println("Transaction Successful...\nYour Current Balance is :"+balance);
			System.out.println("Amount is transferred to "+accountNumber);
		}
		
	}
	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException
	{
		if(amount > 50000)
		{
			throw new LoanNotAllowedException("Maximum Limit of Loan is 50000");
		}
		else if(amount <= 0)
		{
			throw new InvalidAmountException("You Cannot Apply for loan of Negative or Zero Amount.");
		}
		else {
			balance += amount;
			System.out.println("Loan Applied and Credited Successfully..");
			System.out.println("Your Current Balance is :"+balance);
		}
		
	}
	@Override
	public double getBalance() {
		return balance;
	}

}

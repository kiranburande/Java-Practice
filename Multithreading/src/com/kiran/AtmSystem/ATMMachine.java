package com.kiran.AtmSystem;

class Account
{
	private int balance = 0;

	public synchronized void withdraw(int amount)
	{
		System.out.println("Insufficient Balance");
		while(balance < amount)
		{
			try {
				System.out.println("Waiting for deposit");
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		balance = balance-amount;
		System.out.println("Withdraw Successful...");
		System.out.println("Updated balance is :"+balance);
		notify();
	}
	
	public synchronized void deposit(int amount)
	{
		balance += amount;
		System.out.println("Deposit Successful...");
		System.out.println("Updated balance is :"+balance);
		notify();
	}
	
}

class Drawer extends Thread
{
	private Account account;

	public Drawer(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run()
	{
		System.out.println("withdraw");
		int[] withdrawals = {5000, 7000, 3000};
		
		for(int withdraw : withdrawals)
		{
			account.withdraw(withdraw);
			try {
				sleep(1000);
			}
			catch (InterruptedException e) 
			{
			  e.printStackTrace();
			}
		}
	}
}

class Depositor extends Thread
{
	private Account account;

	public Depositor(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run()
	{
		System.out.println("Deposit");
		int[] deposits = {10000, 4000,3000};
		for(int deposit : deposits)
		{
			account.deposit(deposit);
			try {
				sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

public class ATMMachine 
{
	public static void main(String[] args) 
	{
		Account account = new Account();
		Drawer drawer = new Drawer(account);
		Depositor depositor = new Depositor(account);
		
		//Thread t1 = new Thread(drawer);
		//Thread t2 = new Thread(depositor);
		
		drawer.start();
		try {
			Thread.sleep(500);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		depositor.start();
		
	}
}

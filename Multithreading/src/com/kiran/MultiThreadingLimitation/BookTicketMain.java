package com.kiran.MultiThreadingLimitation;

// Limitation of Multi Threading

class BookTicket implements Runnable
{
	 int availableTkt = 1;
	 int wantedTicket;
	 
	 public BookTicket(int wantedTicket)
	 {
		 super();
		 this.wantedTicket = wantedTicket;
	 }
	
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		if(wantedTicket <= availableTkt)
		{
			System.out.println(name+" Your Ticket is Confirmed");
			availableTkt -= wantedTicket;
		}
		else {
			System.err.println("Sorry Available tickets are :"+availableTkt);
		}
		
		
	}
}

public class BookTicketMain {

	public static void main(String[] args) throws InterruptedException 
	{
		BookTicket b1 = new BookTicket(1);
		
		Thread t1 = new Thread(b1,"Scott");
		Thread t2 = new Thread(b1,"Smith");
		
		t1.start();
		//Thread.sleep(1000);
		t2.start();
		
	}

}

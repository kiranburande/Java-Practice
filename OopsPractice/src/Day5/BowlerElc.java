package Day5;

public class BowlerElc {

	public static void main(String[] args) 
	{
		Bowler b = new Bowler();
		
		 b.bowlerDetails("Sachin", 10, 5, 750, 463); 
		 b.computeBowlingAverage();
		 b.computeStrikeRate();
		 b.showStatistics();

	}

}

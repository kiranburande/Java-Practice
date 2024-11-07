package Day5;

public class Bowler 
{
	private String name;
	private int wickets;
	private int matches;
	private int balls_bowled;
	private int runs_conceded;
	
	public void bowlerDetails(String name, int wickets, int matches, int balls_bowled, int runs_conceded)
	{
		this.name = name;
		this.wickets = wickets;
		this.matches = matches;
		this.balls_bowled = balls_bowled;
		this.runs_conceded = runs_conceded;
		
	}
	
	public void computeBowlingAverage()
	{
		if(this.wickets < 0 || this.matches < 0 || this.balls_bowled < 0 || this.runs_conceded < 0)
		{
			System.out.println("Error");
		}
		else
		{
			if(this.matches == 0 && (this.runs_conceded > 0 || this.balls_bowled > 0))
			{
				System.out.println("Error.");
			}
			else
			{
				double avg=0;
				avg = this.runs_conceded/this.wickets ;
				System.out.println("Name: "+this.name);
				System.out.println(" bowling_avg = "+avg);
				
			}
			
		}
		
	}
	
	public void computeStrikeRate()
	{
		if(this.wickets < 0 || this.matches < 0 || this.balls_bowled < 0 || this.runs_conceded < 0)
		{
			System.out.println("Error");
		}
		else
		{
			if(this.matches == 0 && (this.runs_conceded > 0 || this.balls_bowled > 0))
			{
				System.out.println("Error.");
			}
			else
			{
				double strikeRate = this.runs_conceded / this.balls_bowled;
				System.out.println("Name : "+this.name);
				 System.out.println("Strike Rate : "+strikeRate);
				
			}
			
		}
		
	}
	
	public void showStatistics()
	{
		if(this.wickets < 0 || this.matches < 0 || this.balls_bowled < 0 || this.runs_conceded < 0)
		{
			System.out.println("Error");
		}
		else
		{
			if(this.matches == 0 && (this.runs_conceded > 0 || this.balls_bowled > 0))
			{
				System.out.println("Error.");
			}
			else
			{
				System.out.println("Name : "+this.name);
				System.out.println("Wickets : "+this.wickets);
				System.out.println("Matches : "+this.matches);
				System.out.println("Balls Bowled : "+this.balls_bowled);
				System.out.println("Runs Conceded : "+this.runs_conceded);
			}
			
		}
	}
    
}

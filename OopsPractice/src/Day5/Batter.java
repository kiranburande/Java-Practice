package Day5;

public class Batter 
{
	 private String name;
	 private int runs;
	 private int matches;
	 private float batting_avg;
	 
	 public void batterDetails(String name, int runs, int matches)
	 {
		 this.name = name;
		 this.runs = runs;
		 this.matches = matches;
		 
	 }
	 
	 public void computeBattingAverage()
	 {
		 if(this.runs < 0 || this.matches < 0)
		 {
			 System.out.println("Errorr.");
		 }
		 else
		 {
			 if(this.runs > 0 && this.matches == 0)
			 {
				 System.out.println("Error.");
			 }
			 else 
			 {
				 batting_avg = (float)this.runs/this.matches;
				 System.out.println("Name : "+this.name);
				 System.out.println("Batting Avg : "+this.batting_avg);
				 
			 }
			 
		 }
		 
		 
	 }
	 
	 public void getStatistics()
	 {
		 if(this.runs < 0 || this.matches < 0)
		 {
			 System.out.println("Errorr.");
		 }
		 else
		 {
			 if(this.runs > 0 && this.matches == 0)
			 {
				 System.out.println("Error.");
			 }
			 else 
			 {
				 
				 System.out.println("Name : "+this.name);
				 System.out.println("Runs : "+this.runs);
				 System.out.println("Mathes : "+this.matches);
				 
			 }
			 
		 }
		 
	 }

}

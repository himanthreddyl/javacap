// Task
// class Racer
// - define data members according to the above specifications
// -define a constructor according to the above specifications
// -The term/variable used are defined below -
// 1.	action - A string that contains only 3 different characters 'r', 'j', and 'c'. Where 'r' - run, 'c' - crawl, and 'j' - jump.
// 2.	runScore - A int that denotes what score will he get for every 'r' in action string.
// 3.	jumpScore - A int that denotes what score will he get for every 'j' in action string.
// 4.	crawlScore - A int that denotes what score will he get for every 'c' in action string.
// -Implement the below methods for this class:
// -String goodAt():
// •	Write a code that returns the string on the basis of the given conditions -
// •	If a count of the character 'j' is equal to the count of the character 'c' in the string action then return "Perfect".
// •	If a count of the character 'j' is greater than the count of the character 'c' in the string action then return "Jumper".
// •	If a count of the character 'j' is less than the count of the character 'c' in the string action then return "Crawler".
// -int finalScore():
// •	Return the sum of the score for each action.
// 1.	For every 'r' in action, the score will be runScore.
// 2.	For every 'j' in action, the score will be jumpScore.
// 3.	For every 'c' in action, the score will be crawlScore.
// •	Refer Example for better understanding
// action = "jjcr" , runScore = 20, jumpScore = 30, crawlScore = 5
// action.goodAt() returns "Jumper" as 'j' count > 'c' count in action.
// action.finalScore() returns 85 as 20+20+5+30 = 85.
// Sample Input
// Racer racer = new Racer("jjccrrj",10,20,30);
// racer.goodAt();
// Sample Output
// Jumper


class Racer{
	public String action;
	  public int runScore;
	   public int jumpScore;
	   public int crawlScore;
	   public int r=0,j=0,c=0;
	   public Racer(String action, int runScore, int jumpScore, int crawlScore)
	   {
		   this.action=action;
		   this.runScore=runScore;
		   this.jumpScore=jumpScore;
		   this.crawlScore=crawlScore;
	   }
	   public String goodAt()
	   {
		   for(int i=0;i<action.length();i++)
		   {
			   if(action.charAt(i)=='r')
				   r++;
			   if(action.charAt(i)=='j')
				   j++;
			   if(action.charAt(i)=='c')
				   c++;
		   }
		   if(j==c)
		   {
			   return "Perfect";
		   }
		   else if(j>c)
			   return "Jumper";
		   return  "Crawler";
	   }
	   int finalScore()
	   {
		   return r*runScore+j*jumpScore+c*crawlScore;
	   }
}
public class Question23 {
	public static void main(String[] args) {
		Racer racer = new Racer("jjccrrj",10,20,30);
		String s1=racer.goodAt();
		System.out.println(s1);
		System.out.println(racer.finalScore());

	}
}

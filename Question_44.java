class Problem{
	private int credits;
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String type;
	Problem(int credits, String type)
	{
		this.credits=credits;
		this.type=type;
	}
}
class Checker{
	String checkProblem(Problem p) throws ProblemException
	{
		if(p.getCredits()<10)
			throw new ProblemException("Insufficient credits");
		if(p.getType()=="String")
			throw new ProblemException("String problem found");
		try {
			p.getType().getClass();
		}
		catch(Exception e)
		{
			throw new ProblemException("Generic problem found");
		}
		
		
		return "Exception problem found";
	}
	String approveProblem(Problem p)
	{
		try {
			
			checkProblem(p);
		}
		catch(ProblemException e)
		{
			return "Not approved";
		}
		catch(Exception e)
		{
			return "Other exception";
		}
		return "Problem Solved";
	}
}
class ProblemException extends Exception
{
	ProblemException(String s)
	{
		super(s);
	}
}

public class Question44 {
	public static void main(String[] args) throws ProblemException  {
		Problem p=new Problem(41,"Exception");
		Checker c=new Checker();
		String s = c.checkProblem(p);
		String t=c.approveProblem(p);
		System.out.println(s);
		System.out.println(t);

	}
}

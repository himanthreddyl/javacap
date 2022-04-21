// Task
// Class Problem
// - define the int variable credits and string variable type.
// -define a constructor according to the above specifications.
// Class Checker
// Implement the below methods for this class:
// -String checkProblem(Problem p) throws Exception:
// •	Write a code to validate the criteria for approving the problem.
// •	throw a ProblemException if credits of the problem are less than 10 with a message "Insufficient credits".
// •	throw a ProblemException if the type of the problem is "String" with a message "String problem found".
// •	throw a ProblemException if the type of the problem is "Generic" with a message "Generic problem found".
// •	throw a ProblemException if the type of the problem is "I/O" with a message "I/O problem found".
// •	else return "Exception problem found".
// -String approveProblem(Problem p):
// •	Write a code that approves the problem.
// •	If checkProblem method throws a ProblemException then returns a message "Not approved".(Use try-catch block)
// •	If it throws any other exception then return a message "Other exception".
// •	If no exception is found then return a message "Problem approved".
// Sample Input
// Problem p=new Problem(41,"Exception");
// Checker c=new Checker();
// String s = c.checkProblem(p);
// String t=c.approveProblem(p);
// Sample Output
// exception problem found
// problem approved


import java.io.IOException;

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
public class question3 {
	public static void main(String[] args) throws ProblemException  {
		Problem p=new Problem(41,"Exception");
		Checker c=new Checker();
		String s = c.checkProblem(p);
		String t=c.approveProblem(p);
		System.out.println(s);
		System.out.println(t);

	}
}

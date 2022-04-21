import java.util.ArrayList;

class Validator1{
	String checkComment(String comment) throws SpamCommentException
	{
		ArrayList<String>a=new ArrayList<>();
		a.add("abcde");
		a.add("lmno");
		a.add("pqrst");
		a.add("wxyz");
		int count=0;
//		String s[]=comment.split(" ");
//		int n=s.length;
		for(int i=0;i<4;i++)
		{	
			count+=comment.split(a.get(i)).length-1;
		}
		if(count==1)
		{
			throw new SpamCommentException("spam comment");
		}
		else if(count>2)
			throw new SpamCommentException("account ban due to spam comment");
		return "comment is not spam";
	}
	String commentTheString(String comment)
	{
		try {
			checkComment(comment);
		}
		catch(SpamCommentException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "comment posted";
	}
}

class SpamCommentException extends Exception
{
	SpamCommentException(String s)
	{
		super(s);
	}
}
public class Question5 {
	public static void main(String[] args) throws SpamCommentException {
		Validator1 obj = new Validator1();
//		-------------------------------------------
		String s1=obj.checkComment("hello my name is steve");
		String s2=obj.commentTheString("my comment is safe to post");
		System.out.println(s1);
		System.out.println(s2);

}
}
// Task
// Class Validator
// Implement the below methods for this class:
// -String checkComment(String comment):
// •	Write a code to validate the comment.
// •	throw a SpamCommentException, if comment has these words["abcde", "lmno", "pqrst", "wxyz"] in it, with the message "spam comment".
// •	throw a SpamCommentException, if a comment contains more than 2 words from the above list, with the message "account ban due to spam comment". Note same words with a frequency of more than 2 will come in this category.
// •	return a string message "comment is not spam" If none of the above exceptions is found.
// Refer the example for better understanding.
// s0 = "hello my name is steve and using abcde"
// s1 = "hello my name is steve and using abcde abcde"
// s2 = "hello my name is steve and using abcde lmno pqrst"
// s3 = "hello my name is steve and using abcde abcde lmno"
// s0 and s1 come under spam comment message.
// s2 and s3 comes under the account ban message.
// -String commentTheString(String comment):
// •	Write a code to put the comment on the post.
// •	If a checkComment method throws a SpamCommentException ,then return a message of that exception(Use try-catch block).
// •	If it throws any other exception then return a message "other exception".
// •	If no exception is found then return a message "comment posted".
// class SpamCommentException
// -Define SpamCommentException class derived from Exception class
// Sample Input
// Validator obj = new Validator();
// -------------------------------------------
// obj.checkComment("hello my name is steve");
// obj.commentTheString("my comment is safe to post");
// Sample Output
// comment is not spam
// comment posted

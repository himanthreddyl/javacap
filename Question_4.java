// Class Rating
// - define the int variable imdbRating.
// - define the int variable nominee
// -define a constructor according to the above specifications.
// Class Validator
// Implement the below methods for this class:
// -String canBeConsideredForTheAward(Rating rating) throws Exception:
// •	Write a code to validate the criteria for getting the award.
// •	throw a MovieRatingException if imdbRating is less than 7 with the message "Movie not eligible for Filmfare award".
// •	throw a MovieRatingException if nominee is less than 4 with the message "Minimum 4 nominee required".
// •	If no above exception found then return a string message "Considered for the award".
// -String sendInvite(Rating rating):
// •	Write a code to send an invite to the nominee.
// •	If canBeConsideredForTheAward method throws a MovieRatingException then return a message "Not invited".(Use try-catch block)
// •	If it throws any other exception then return a message "other exception".
// •	If no exception found then return a message "Actors and Directors Invited".
// Sample Input
// Rating rating = new Rating(9, 7);
// Validator v = new Validator();
// ------------------------------------------------------
// String s = v.canBeConsideredForTheAward(rating);
// String t = v.sendInvite(rating);
// s.toLowerCase();
// t.toLowerCase();
// Sample Output
// considered for the award
// actors and directors invited


class Rating{
	private int imdbRating;
    public int getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(int imdbRating) {
		this.imdbRating = imdbRating;
	}
	public int getNominee() {
		return nominee;
	}
	public void setNominee(int nominee) {
		this.nominee = nominee;
	}
	private int nominee;
    Rating(int imdbRating, int nominee)
    {
    	this.imdbRating=imdbRating;
    	this.nominee=nominee;
    }

}
class Validator{
	String canBeConsideredForTheAward(Rating rating) throws MovieRatingException
	{
		if(rating.getImdbRating()<7)
			throw new MovieRatingException("Not elgible for filmfare");
		if(rating.getNominee()<4)
			throw new MovieRatingException("Minimum 4 nominee required");
		return "Considered for the award";
	}
	String sendInvite(Rating rating) {
		try {
			canBeConsideredForTheAward(rating);
		}
		catch(MovieRatingException e)
		{
			return "Not invited";
		}
		catch(Exception e)
		{
			return "other exception";
		}
		return "Actors and Directors Invited";
	}
}
class MovieRatingException extends Exception{
	MovieRatingException(String s)
	{
		super(s);
	}
}
public class Question4 {
	public static void main(String[] args) throws MovieRatingException {
		Rating rating = new Rating(9, 7);
		Validator v = new Validator();
		String s = v.canBeConsideredForTheAward(rating);
		String t = v.sendInvite(rating);
		s.toLowerCase();
		t.toLowerCase();
		System.out.println(s);
		System.out.println(t);


	}
}

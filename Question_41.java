package Question33_60;
class Food{
	String plate;
	int numberOfSoldiers;
	public Food(String plate,int numberOfSoldiers)
	{
		this.plate=plate;
		this.numberOfSoldiers=numberOfSoldiers;
	}
}
class KhumbhKaran{
	String getReadyToFight(Food food) throws FoodException
	{
		int b=0;
		int a=0;
		for(int i=0;i<food.plate.length();i++)
		{
			if(!Character.isDigit(food.plate.charAt(i)))
				b=1;
			if(Character.isAlphabetic(food.plate.charAt(i)))
				a=1;
		}	
		if(b==1)
			throw new FoodException("Insect found in the food");
		if(a==1)
			throw new FoodException("Not edible");
		if(food.numberOfSoldiers<1000)
			throw new FoodException("Food was not sufficient");
		return "Ready for the war";
	}
	String winTheWar(Food food)
	{
		try {
			getReadyToFight(food);
		}
		catch(FoodException e)
		{
			return "No war";
		}
		catch(Exception e1)
		{
			return "Other exception";
		
		}return "Here the battle starts";
	}
}
class FoodException extends Exception{
	FoodException(String s)
	{
		super(s);
	}
}
public class Question41 {
	public static void main(String[] args) throws FoodException
	{
		Food f = new Food("1234", 70000);
		KhumbhKaran v = new KhumbhKaran();
		String s = v.getReadyToFight(f);
		String t = v.winTheWar(f);
		s.toLowerCase();
		t.toLowerCase();
		System.out.println(s);
		System.out.println(t);

	}
}

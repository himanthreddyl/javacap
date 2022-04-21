class Laptop{
	int price;
	String details;
	Laptop(String details,int price)
	{
		this.price=price;
		this.details=details;
	}
}
class Afford{
	String checkConfiguration(Laptop laptop) throws LaptopException
	{
		String det[]=laptop.details.split("/");
		if(laptop.price>70000)
			throw new LaptopException("Price too high");
		if(Integer.valueOf(det[0])<8)
			throw new LaptopException("Minimum 8 RAM required");
		if(Integer.valueOf(det[1])<256)
			throw new LaptopException("Minimum 256 space required");
		if(det[2]=="HDD")
			throw new LaptopException("SSD required");
		return "Can be purchased";
	}
	String purchaseLaptop(Laptop laptop) 
	{
		try {
			checkConfiguration(laptop);
		}
		catch(LaptopException e)
		{
			return "Change configuration";
		}//package Question33_60;
		catch(Exception e1)
		{
			return "Other exception";
		}
		return "Perfect configuration";
	}
}
class LaptopException extends Exception{
	LaptopException(String s)
	{
		super(s);
	}
}
public class Question42 {
	public static void main(String[] args) throws LaptopException {
		Laptop laptop=new Laptop("8/512/SSD", 58000);
		Afford af=new Afford(); 
		String s=af.checkConfiguration(laptop);
		String t=af.purchaseLaptop(laptop);
		System.out.println(s.toLowerCase());
		System.out.println(t.toLowerCase());

	}
}

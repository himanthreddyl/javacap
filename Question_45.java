class Customer{
	String name;
	long mobile;
	char key;
	Customer(String name,long mobile,char key)
	{
		this.name=name;
		this.mobile=mobile;
		this.key=key;
	}
	String encrypt()
	{
		String k=String.valueOf(key);
		if(name.contains(k))
		{
			return "Already Encrypted";
		}
		int n=name.length();
		int div=(int) Math.pow(10, n);
		int sno=(int)mobile/div;
		System.out.println(mobile);
		String add="";
		for(int i=0;i<sno;i++)
			add+=key;
		
		return name.concat(add);
	}
	long minCount()
	{
//		long val;
		String no=String.valueOf(mobile);
		int min=Character.getNumericValue(no.charAt(0));
		for(int i=0;i<no.length();i++)
		{
			if(min>Character.getNumericValue(no.charAt(i)))
				min=Character.getNumericValue(no.charAt(i));
		}
		return (long)min;
	}
}
public class Question45 {
	public static void main(String[] args) {
		Customer customer = new Customer("Doselect", 299999992, '#');
		System.out.println(customer.encrypt());
		System.out.println(customer.minCount());
		

	}
}

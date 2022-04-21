class Material {
	int mass;
	int temperature;
	public Material(int mass, int temperature)
	{
		this.mass=mass;
		this.temperature=temperature;	
	}
	public String flowOfHeat()
	{
		try {
			checkMaterial();
		}
		catch(MaterialException e)
		{
			return "Invalid material";
		}
		return "Both in Equilibrium" ;
	}
	public String checkMaterial() throws MaterialException 
	{
		if(mass<0)
			throw new MaterialException("Mass cannot be negative");
		else if(mass==0)
			throw new MaterialException("Mass cannot be zero");
		else
			return "Valid material";
		
		
		
		
			
				
	}
		
}
class MaterialException extends Exception {
	public MaterialException(String msg)
	{
		super(msg);
	}
	
}
public class Question1 {
	public static void main(String[] args) {
		Material m=new Material(12,32); 
		String s=m.flowOfHeat(); 
		System.out.println(s);
	}
}
// Class Material
// -define all the data members as per the given specifications.
// -define the constructor with public visibility.
// -Implement the below methods for this class:
// -String checkMaterial() throws Exception:
// •	Write a code to check whether the material is valid or not.
// •	throw a MaterialException if the mass is negative with a message "Mass cannot be negative".
// •	throw a MaterialException if the mass is zero with a message "Mass cannot be zero"
// •	if no exception is found return "Valid material"
// -String flowOfHeat() throws Exception:
// •	If checkMaterial() method throws a MaterialException then returns a message "Invalid Material".(Use try-catch block)
// •	If it throws any other exception then return a message "Other exception".
// •	If no exception is found then return "Both in equilibrium".
// Sample Input
// Material m=new Material(12,32);
// String s=m.flowOfHeat();
// Sample Output
// Both in equilibrium

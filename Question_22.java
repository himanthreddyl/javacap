// Task
// Class Dance
// -define the object of HashMap<String, Integer> with variable name steps.
// •	The String defines the name of the step and the integer will have number of ways it is performed.
// Implement the below methods for this class:
// -String newStep(String name, int ways):
// •	Write a code to add a new step in the number of ways.
// •	If the step does not exist then create it and add the step to the hashmap and return "New step".
// •	Update the number of ways if the name already exists  
// •	 return "Stepped in" after performing the above operations if it already exists.
// -int findStep(String name):
// •	Write a code to return the number of ways a particular step can be performed.
// •	If it is not present then return 0 else return the number of ways.
// Sample Input
// Dance obj = new Dance();
// obj.newStep("Step1",9);
// Sample Output
// New step


import java.util.*;
class Dance{
	HashMap<String,Integer> steps=new HashMap<>();
	public String newStep(String name, int ways)
	{
		if(steps.containsKey(name)==true)
		{
			steps.replace(name, ways);
			return "Stepped in"; 
		}
		steps.put(name, ways);
		return "New step";
		
	}
	public int findStep(String name)
	{
		if(steps.containsKey(name))
		{
			return steps.get(name);
		}
		return 0;
	}
}
public class Question22 {
	public static void main(String[] args) {
		Dance obj = new Dance();
		String s1=obj.newStep("Step1",9);
		String s2=obj.newStep("Step1",11);
		System.out.println(s2);
		System.out.println(obj.findStep("Step1"));
	}
}

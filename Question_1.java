import java.util.*;
enum FoodType{
	VEG,
	NONVEG
}
class sortbyAge implements Comparator<Consumer>
{

	@Override
	public int compare(Consumer c1,Consumer c2)
	{
		return c1.getAge()-c2.getAge();
	}
	
}
class Consumer{
	private String name;
    private int age;
    private FoodType foodType;
	public Consumer(String name, int age, FoodType foodType) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.foodType=foodType;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public FoodType getFoodType() {
		return foodType;
	}
	@Override
	public String toString() {
		return "Consumer [name=" + name + ", age=" + age + ", foodType=" + foodType + "]";
	}
    

}
class Implementation5{
	public List<Consumer> getNonVegetarianList(List<Consumer> consumer)
	{
		ArrayList<Consumer>a=new ArrayList<>();
		for(int i=0;i<consumer.size();i++)
		{
			if(consumer.get(i).getFoodType()==FoodType.NONVEG)
			{
				a.add(consumer.get(i));
			}
		}
		return a;
	}
	public List<Consumer> sortConsumersByAge(List<Consumer> consumer)
	{
		ArrayList<Consumer>a=new ArrayList<>();
		
		Collections.sort(consumer, new sortbyAge());
		return consumer;
	}
}
public class Question1 {
	public static void main(String[] args) {
		Implementation5 imp = new Implementation5(); 

		 Consumer p = new Consumer("Sarah", 45, FoodType.VEG);
		 Consumer p1 = new Consumer("John", 26, FoodType.NONVEG);
		 Consumer p2 = new Consumer("Mirra", 7, FoodType.NONVEG);

		List<Consumer> consumers = Arrays.asList(p, p1, p2);
		      
		System.out.println(imp.getNonVegetarianList(consumers));
		System.out.println(imp.sortConsumersByAge(consumers));

	}
}
// Task:
// enum : has been defined for you in the code stub
// class Consumer:
// - define the data members according to above specifications
// -define a constructor and getters according to the above specifications
// -toString() method has been implemented for you as a part of the code stub
// class Implementation:
// Implement the below method for this class using in Stream API:
// •	List<Consumer> getNonVegetarianList(List<Consumer> consumer):
// fetch the details where FoodType is NONVEG, put into a list and return the list
// •	List<Consumer> sortConsumerByAge(List<Consumer> consumer):
// sort the list of consumers by age and return it(in ascending order)
// Refer Sample Input Output for more details
// Sample Input
// Implementation imp = new Implementation(); 

//  Consumer p = new Consumer("Sarah", 45, FoodType.VEG);
//  Consumer p1 = new Consumer("John", 26, FoodType.NONVEG);
//  Consumer p2 = new Consumer("Mirra", 7, FoodType.NONVEG);

// List<Consumer> consumers = Arrays.asList(p, p1, p2);
      
// imp.getNonVegetarianList(consumers)
// imp.sortConsumersByAge(consumers)  
// Sample Output
// [Consumer{name='John', age=26, foodType=NONVEG}, Consumer{name='Mirra', age=7, foodType=NONVEG}]
// ---------------------METHOD 1------------------------------
// [Consumer{name='Mirra', age=7, foodType=NONVEG}, Consumer{name='John', age=26, foodType=NONVEG}, Consumer{name='Sarah', age=45, foodType=VEG}]
// ---------------------METHOD 2------------------------------

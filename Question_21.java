// Task
// Class Car
// - define all the variables according to the above specifications.
// - define a constructor with public visibility.
// Class CarRacing
// - define all the variables according to the above specifications.
// - define
// •	participants as ArrayList<Car> cars = new ArrayList<>();
// - define a constructor with public visibility.
// Implement the below methods for this class:
// -String carEntry(Car car):
// •	Write a code that adds the given car to the list of cars according to the given conditions.
// •	If the trackCount is equal to the length of the list cars then return "No Space".
// •	If the list cars have already an entry with the same id as the given parameter car then return "Already exists".
// •	If both the above condition does not satisfy then add the given parameter car into the list of cars and return "Start practicing".
// -int getWinner(int trackLength):
// •	Write a code that returns the carId of the winner.
// •	If no entry exists then return -1.
// •	Else return the carId of the car with maximum time.
// •	The formula to calculate the time = trackLength * speed.
// •	If two cars have the same time then return the carId which is added to the list of cars first.
// Sample Input
// Car car = new Car(1,100);
// CarRacing carRacing = new CarRacing(2);
// carRacing.carEntry(car);
// Sample Output
// Start practicing


import java.util.*;
class Car1{
	public int carId;
	public int speed;
	Car1(int carId,int speed)
	{
		this.carId=carId;
		this.speed=speed;
	}
}
class CarRacing{
	ArrayList<Car1> cars = new ArrayList<>();
	int trackCount;
	CarRacing(int trackCount)
	{
		this.trackCount=trackCount;
	}
	public String carEntry(Car1 car)
	{
		if(trackCount==cars.size())
			return "No space";
		for(int i=0;i<cars.size();i++)
		{
			if(cars.get(i).carId==car.carId)
			{
				return "Already exists";
			}
		}
		return "Start practicing";
	}
	public int getWinner(int trackLength)
	{
		if(cars.size()==0)
			return -1;
		int time=trackLength*cars.get(0).speed;
		int ind=0;
		for(int i=1;i<cars.size();i++)
		{
			if(time<trackLength*cars.get(i).speed)
			{
				time=trackLength*cars.get(i).speed;
				ind=i;
			}
		}
		return cars.get(ind).carId;
	}
}
public class Question21 {
	public static void main(String[] args) {
		Car1 car = new Car1(1,100);
		CarRacing carRacing = new CarRacing(2);
		System.out.println(carRacing.carEntry(car));

	}
}

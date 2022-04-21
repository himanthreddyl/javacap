// Task:
// enum Specialty:
// -Define enum according to the above specifications
// class Specialist:
// - Define the class according to the above specifications
// class Implementation:
// Implement the below method for this class:
// •	Specialist findWithMaxSalary(List<Specialist> specialists): return the details of the specialist with the maximum salary
// •	boolean matchAllEngineers(List<Specialist> specialists): return true if all the specialist have speciality = ENGINEER, else return false
// Refer sample output for clarity
// Sample Input
// List<Specialist> list = Arrays.asList(
//   new Specialist("Ivan Ivanov", new BigDecimal(5000), Specialty.ENGINEER),
//   new Specialist("Sergey Sergeev", new BigDecimal(3000), Specialty.DEVOPS),
//   new Specialist("Petr Petrov", new BigDecimal(10000), Specialty.MANAGER)
//         );
// Sample Output
// Specialist{name='Petr Petrov', salary=10000, specialty=MANAGER}
// -----------------------------------------------------------
// false


import java.math.BigDecimal;
import java.util.*;
enum Specialty{
	ENGINEER,
	MANAGER,
	DEVOPS
}
class Specialist{
	private String name;
	private BigDecimal salary;
	private Specialty speciality;
	Specialist(String name, BigDecimal salary, Specialty specialty)
	{
		this.name=name;
		this.salary=salary;
		this.speciality=specialty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public Specialty getSpeciality() {
		return speciality;
	}
	public void setSpeciality(Specialty speciality) {
		this.speciality = speciality;
	}
	public String toString()
	{
		return "Specialist{name="+getName()+", salary="+getSalary()+", specialty="+getSpeciality()+"}";
	}
}
class Implementation1{
		Specialist findWithMaxSalary(List<Specialist> specialists){
		BigDecimal maxi=specialists.get(0).getSalary();
		int indi=0;
		for(int i=0;i<specialists.size();i++)
		{
			if(maxi.compareTo(specialists.get(i).getSalary())<0)
			{
				maxi=specialists.get(i).getSalary();
				indi=i;
			}
		}
		return specialists.get(indi);
	}
	boolean matchAllEngineers(List<Specialist> specialists)
	{
		boolean b=true;
		for(int i=0;i<specialists.size();i++)
		{
			if(specialists.get(i).getSpeciality()!=Specialty.ENGINEER)
			{
				b=false;
			}
		}
		return b;
	}
}
public class Question24 {
	public static void main(String[] args) {
		List<Specialist> list = Arrays.asList(
				  new Specialist("Ivan Ivanov", new BigDecimal(5000), Specialty.ENGINEER),
				  new Specialist("Sergey Sergeev", new BigDecimal(3000), Specialty.DEVOPS),
				  new Specialist("Petr Petrov", new BigDecimal(10000), Specialty.MANAGER)
				        );
		Implementation1 imp=new Implementation1();
		System.out.println(imp.findWithMaxSalary(list));
		System.out.println(imp.matchAllEngineers(list));
	}
}

package Streams;
import java.util.*;


class Customerdetails
{
	private int EmpId;
	private String Name;
	public Customerdetails(int empId, String name) {
		super();
		EmpId = empId;
		Name = name;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
class Fooddetails 
{
	int foodId;
	String food;
	int price;
	@Override
	public String toString()
	{
		return "Fooddetails [foodid=" + foodId +", name= " + food + " , price=" + price + "]";
	}
	public Fooddetails(int foodId, String food, int price) {
		super();
		this.foodId = foodId;
		this.food = food;
		this.price = price;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	 
}

public class CurdApplication {

	public static void main(String[] args) {
		System.out.println("Enter UID:");
		Scanner sc1=new Scanner(System.in);
		int EmpId=sc1.nextInt();
		System.out.println("Enter name:");
		Scanner sc2=new Scanner(System.in);
		String Name=sc2.nextLine();
		
		Fooddetails f1= new Fooddetails(12,"veg meals",80);
		Fooddetails f2= new Fooddetails(13,"fishcurry meals",120);
		Fooddetails f3= new Fooddetails(14,"chapathy vegcurry",90);
		Fooddetails f4= new Fooddetails(14,"chapathy chickencurry",120);
		Fooddetails f5= new Fooddetails(16,"veg friedrice", 60);
		Fooddetails f6= new Fooddetails(17,"chicken friedrice",150);
		
		List<Fooddetails>food=Arrays.asList(f1,f2,f3,f4,f5,f6);
	    System.out.println(food);
		}
	    
	    
		
		

	}



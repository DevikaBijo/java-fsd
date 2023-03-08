package Hashmap;
import java.util.*;

class Employee {
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	private String department;
	
}
public class HashmapEmployee
{
	public static void main(String args[])
	{
		
		Employee e=new Employee();
		e.setId(12);
		e.setName("devika");
		e.setAge(21);
		e.setDepartment("developer");
		
		HashMap<String ,Employee>map=new HashMap<>();
		map.put("TVM",e);
		
		Employee y=map.get("TVM");
		System.out.println("employee details are:");
		System.out.println(y.getId());
		System.out.println(y.getName());
		System.out.println(y.getAge());
		System.out.println(y.getDepartment());
		
		
	}
}






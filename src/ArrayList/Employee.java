package ArrayList;
import java.util.*;
import java.util.stream.Collectors;


class EmployeeDetails
{
	String name;
    int Id;
	double salary;
	public EmployeeDetails(String name, int id, double salary) {
		super();
		this.name = name;
		Id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}



public class Employee {

	public static void main(String[] args) {
		
		EmployeeDetails e1= new EmployeeDetails("devika",12,50000);
		EmployeeDetails e2= new EmployeeDetails("meenakshi",13,100000);
		EmployeeDetails e3= new EmployeeDetails("amitha",14,25000);
		List<EmployeeDetails> em=Arrays.asList(e1,e2,e3);
		List<EmployeeDetails>updated=em.stream().sorted(Comparator.comparing(EmployeeDetails::getSalary).reversed())
				.peek(t->{
					double salary=t.getSalary();
					if(salary>100000) {
						t.setSalary(salary*1.05);
					}
					else if(salary>50000) {
						t.setSalary(salary*1.1);
					}
				}).collect(Collectors.toList());
		updated.forEach(t->System.out.println(t.getName()+ ""+t.getSalary()));
	}

}

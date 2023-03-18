package ustbatchno3.SonarcubeTest;

import java.util.Arrays;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		 Employee  e1= new Employee ("devika",22,1,50000);
		 Employee  e2= new Employee ("amitha",25,3,60000);
		 Employee  e3= new Employee ("meenakshi",23,2,70000);
		 List<Employee>newlist=Arrays.asList(e1,e2,e3);
			newlist.stream().forEach(
					val->{
						if(val.getYears()>=1 && val.getYears()<=2) {
	                        double newSalary = val.getSalary() + (val.getSalary() * 2.5 / 100);
	                        val.setSalary(newSalary);
	                    } else if (val.getYears()>=3 && val.getYears()<=6) {
	                        double newSalary = val.getSalary() + (val.getSalary() * 5.0 / 100);
	                        val.setSalary(newSalary);
	                    } else if (val.getYears()>=7 && val.getYears()<=10) {
	                        double newSalary = val.getSalary() + (val.getSalary() * 10.0 / 100);
	                        val.setSalary(newSalary);
	                    } else if (val.getYears()>10) {
	                        double newSalary = val.getSalary() + (val.getSalary() * 2.5 / 100);
	                        val.setSalary(newSalary);
	                    }
						
					}
					);
			newlist.forEach(val ->
            System.out.println(val.getSalary())
			);	
      }
}

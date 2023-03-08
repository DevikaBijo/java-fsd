package ArrayList;
import java.util.*;
import java.util.stream.Collectors;

class CustomerDetails
{
	int RegisterId;
	String Name;
	String Phonenum;
	String EmailId;
	public CustomerDetails(int registerId, String name, String phonenum, String emailId) {
		super();
		RegisterId = registerId;
		Name = name;
		Phonenum = phonenum;
		EmailId = emailId;
	}
	public int getRegisterId() {
		return RegisterId;
	}
	public void setRegisterId(int registerId) {
		RegisterId = registerId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhonenum() {
		return Phonenum;
	}
	public void setPhonenum(String phonenum) {
		Phonenum = phonenum;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
}


public class Customers {

	public static void main(String[] args) {
		
		CustomerDetails c1= new CustomerDetails(1,"devika","9061861825","devika@gmail.com");
		CustomerDetails c2= new CustomerDetails(2,"meenakshi","9995076030","meenakshi@gmail.com");
		CustomerDetails c3= new CustomerDetails(3,"amitha","7896543522","amitha@gmail.com");
		List<CustomerDetails>cd=Arrays.asList(c1,c2,c3);
		System.out.println("enter register id:");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		List<CustomerDetails>details=cd.stream().filter(t->t.getRegisterId()==id).collect(Collectors.toList());
		for(CustomerDetails d:details)
		{
			System.out.println("Id:" +d.getRegisterId());
			System.out.println("name:" +d.getName());
			System.out.println("phonenum:"+d.getPhonenum());
			System.out.println("emailId:"+d.getEmailId());
		}
			
	}

}


package Details;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Customer c1=new Customer(12345,"devika","devikabijo@gmail.com");
		Savingaccount s1=new Savingaccount(909, 5000.0, c1, 1000.0);
		
		Scanner sc = new Scanner(System.in);
		double amount=sc.nextDouble();
	    
		
		System.out.println(s1.withdraw(5000.0));
		
		
	}
	
}

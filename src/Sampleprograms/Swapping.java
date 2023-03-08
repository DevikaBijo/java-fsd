package Sampleprograms;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		int temp;
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter first number");
		int num1= sc1.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.println("ente second number");
		int num2= sc2.nextInt();
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("values after swapping, first number becomes " +num1);
		System.out.println("values after swapping, second number becomes " +num2);
		
		
		
		}
	
	

}

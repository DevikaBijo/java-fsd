package Sampleprograms;
import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
		int rev=0,d,temp;
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			d=num%10;
			rev=(rev*10)+d;
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println("the number is pallindrome ");
		}else
		{
			System.out.println("the number is not pallindrome ");	
		}
		
		

	}

}

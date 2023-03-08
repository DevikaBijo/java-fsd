package Sampleprograms;
import java.util.*;

public class Reversestring {

	public static void main(String[] args) {
		System.out.println("enter a string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String reversedstr="";
		for(int i=str.length()-1; i>=0;i--)
		{
			
			reversedstr=reversedstr + str.charAt(i) ;
		}
		System.out.println("reversed string is:" +reversedstr);
		 
		
		
	}


}

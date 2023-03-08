package Sampleprograms;
import java.util.*;

public class PallindromeString {

	public static void main(String[] args) {
		System.out.println("enter a string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String reversedstr="";
		String temp=str;
		for(int i=str.length()-1; i>=0;i--)
		{
			
			reversedstr=reversedstr + str.charAt(i) ;
		}
		
		System.out.println("reversed string is:" +reversedstr);
        if(temp.equals(reversedstr))
		{
			System.out.println("string is pallindrome");
		}
		else
		{
			System.out.println("string is not pallindrome");
		}
	}
}


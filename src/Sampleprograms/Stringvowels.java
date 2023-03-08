package Sampleprograms;

import java.util.*;

public class Stringvowels {

	public static void main(String[] args) {
		System.out.println("enter a string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int vcount=0;
		int ccount=0;
		String str1= str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
			vcount++;
			}
			else
			{
				ccount++;
			}
		}
		System.out.println("vowel count is: "+vcount);
		System.out.println("consonants count is: "+ccount);
		

	}

}

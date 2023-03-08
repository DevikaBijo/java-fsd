package Sampleprograms;

import java.util.*;
public class Whitespace {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.replaceAll("\\s" ,"");
		System.out.println("after removing white spaces:" +str);

	}

}

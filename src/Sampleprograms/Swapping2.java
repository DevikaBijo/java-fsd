package Sampleprograms;

import java.util.Scanner;

public class Swapping2 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter first number");
		int a= sc1.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.println("ente second number");
		int b= sc2.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("values after swapping, first number becomes " +a);
		System.out.println("values after swapping, second number becomes " +b);
	}

}

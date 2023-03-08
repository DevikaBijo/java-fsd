package Array;
import java.util.*;

public class Cumulativesum {
	
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int length=sc.nextInt();
		int [] array=new int[length];
		int []cm =new int[length];
		
		int sum=0;
		System.out.println("enter elements to the array");
		for(int i=0;i<length;i++)
		 {
			array[i]=sc.nextInt();
			sum+=array[i];
			cm[i]=sum;
		 }
		System.out.println("final result is");
		for(int i=0;i<length;i++)
		{
			System.out.println(cm[i]+ " ");
			
		}
		
		
		
	}

}

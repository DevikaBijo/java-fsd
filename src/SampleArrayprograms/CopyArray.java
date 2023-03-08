package SampleArrayprograms;
import java.util.*;


public class CopyArray {

	public static void main(String[] args) {
		
		System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        System.out.println("entering elements to array");
        
        for( int i=0;i<n;i++)
        {
        	
        	arr[i]=sc.nextInt();
        		
        }
        System.out.println("elements of array are:");
        for(int i=0;i<n;i++)
        {
        	
        System.out.println(arr[i] +" ");
        }
        
      
        
	}

}


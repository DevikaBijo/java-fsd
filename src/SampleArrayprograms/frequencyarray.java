package SampleArrayprograms;

import java.util.Scanner;

public class frequencyarray {

	public static void main(String[] args) {
		System.out.println("enter size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("entering elements to array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("elements of array are:");
		for(int i=0;i<n;i++)
		{
			 System.out.println(arr[i] +" ");
		}
		
		int freqarray[]=new int[arr.length];
		int counted=-1;
		for(int i=0;i<n;i++)
			
		{     
			int count=1;
			for(int j=i+1;j<n;j++)
			if(arr[i]==arr[j])
		{   
			
			count++;
			freqarray[j]= counted;
		}
	}
		
	if(freqarray[i]!=counted)
		{
		
		
		freqarray[i]= count;
		}
  
	for(int i=0;i<freqarray.length;i++)
     {
	 if(freqarray[i]!=counted)
	 {
		 System.out.println("element:" +arr[i] + "frequqncy" +freqarray[i]);
	 }
    }

}
}

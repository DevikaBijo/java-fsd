package Collections;
import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		int[]arr1= {1,2,3,4,5};
		int[]arr2= {5,6,7,8,9};
		System.out.println("Array1:" +Arrays.toString(arr1));
		System.out.println("Array2:" +Arrays.toString(arr2));
		Findcommonelements(arr1,arr2);

	}
	public static void Findcommonelements(int[]arr1,int[]arr2)
	{
	 	Set<Integer>set1=new HashSet<Integer>();
	 	Set<Integer>set2=new HashSet<Integer>();
	 	for(int i:arr1)
	 	{
	 		set1.add(i);
	 	}
	 	for(int i:arr2)
	 	{
	 		set2.add(i);
	 	}
	 	set1.retainAll(set2);
	 	System.out.println("common elements are" +set1);
	}

}

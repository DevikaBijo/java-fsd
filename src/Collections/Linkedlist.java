package Collections;
import java.util.*;


public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer>list=new LinkedList<Integer>();
		 System.out.println("enter the elements");
		 int size;
			for(int i=0;i<5;i++)
			 {
				
				 Scanner sc=new Scanner(System.in);
				 list.add(sc.nextInt());
				 list.size();
			 }
		    System.out.println("The middle elem:ent is"  +list.get(list.size()/2));
	}

}


package Collections;

import java.util.*;

public class Arraylistexample2 {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("devika");
		list.add("meenakshi");
		list.add("amitha");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

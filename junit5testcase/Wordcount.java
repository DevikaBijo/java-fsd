package ustbatchno3.junit5testcase;

import java.util.*;

public class Wordcount {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("devika");
		list.add("meenakshi");
		list.add ("amitha");
		list.add("devika");
		String search ="devika";
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			if(search.equals(list.get(i)))
			{
				count++;
			}
			
		}
   System.out.println("count is:"+count);
	}

}

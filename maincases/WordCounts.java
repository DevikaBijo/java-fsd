package ustbatchno3.junit5testcase;


import java.util.*;

import java.util.stream.Collectors;


public class WordCounts {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("devika","meenakshi","amitha","devika");
	}
	
    public static int counting()
		{
			Set<String> names=new HashSet<String>(list);
			for(String key:names)
			{
			System.out.println(key +" "+Collections.frequency(list,key));
			
			}
			return names;
		
		}
		
	}



package Hashmap;
import java.util.*;

public class Hashmapexample {

	public static void main(String[] args) {
		HashMap<String, Integer>map=new HashMap<>();
		map.put("devika",21);
		map.put("meenakshi",23);
		map.put("amitha",25);
		System.out.println(map);
		
		int age =map.get("devika");
		System.out.println("age is:" +age );
		map.remove("amitha");
		System.out.println(map);
		
		boolean a = map.containsKey("devika");
		System.out.println("hashmap contains:" +a);
		for(String name:map.keySet())
		{
		int value=map.get(name);
		System.out.println("key values are:" +value);
		}

	}

}

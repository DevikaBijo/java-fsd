package ArrayList;
import java.util.*;
public class FrequencyList {

	public static void main(String[] args) {
		List<String>s=Arrays.asList("trivandrum","ernakulam","idukki","ernakulam");
		List<String>count=s.stream().filter(i->Collections.frequency(s,i)>1).collect(Collector.toList());
		long total=count.stream().count();
		System.out.println(total);

	}

}

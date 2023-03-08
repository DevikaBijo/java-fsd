package ArrayList;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class Cities {
	public static void main(String[] args) {
		List<String>s=Arrays.asList("Trivandrum" ,"Thodupuzha","Ernakulam");
		List<String>cities= s.stream().filter(t->t.startsWith("T")).collect(Collectors.toList());
        System.out.println(cities);
}
}
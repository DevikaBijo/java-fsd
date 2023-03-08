package ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEven {
	public static void main(String[] args) {
		List<Integer>s=Arrays.asList(2,3,4,5);
		List<Integer>even=s.stream().filter(t->t%2==0).map(t->t*t).collect(Collectors.toList());
		System.out.println(even);
		
}
}
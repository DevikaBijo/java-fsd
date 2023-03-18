package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
public class largestnum {

	public static void main(String[] args) {
		int k=2;
		LinkedList<Integer>ls= new LinkedList<>();
		ls.add(1);
		ls.add(6);
		ls.add(3);
		ls.add(2);
		ls.add(5);
		int value=ls.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(k-1)
                .limit(1)
                .findFirst()
                .orElse(0);
               
                
		 System.out.println("The " + k + " largest element is: " + value);

	}

}

package ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class ListSquare {

	public static void main(String[] args) {
		List<Integer>s=Arrays.asList(2,3,4,5);
		List<Integer>squarelist=s.stream().map(t->t*t).collect(Collectors.toList());
	    System.out.println(squarelist);

	}

}

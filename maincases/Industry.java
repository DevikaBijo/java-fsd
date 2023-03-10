package ustbatchno3.junit5testcase;


import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Industry {

	

	public static long countgarments(List<String> items, LocalDate dateBefore) {
		
		return items.stream().count();
	}

	public static long countprice(List<Integer> price, LocalDate dateBefore) {
		return price.stream().mapToInt(Integer::intValue).sum();
	};
	}

	
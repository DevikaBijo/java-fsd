package ustbatchno3.junit5testcase;


import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class Textindustry {
	@Test
public void countindustry(){
		
		List<String> items=Arrays.asList("t-shirt","fork","tops","jeans","dhothi");
		List<Integer> price=Arrays.asList(2000,1500,800,900,1000);
		LocalDate dateBefore = LocalDate.of(2017, Month.MAY, 24);
		long expected_count=5;
		long expected_price=6200;
		long actual1=Industry.countgarments(items,dateBefore);
		long actual2=Industry.countprice(price,dateBefore);
		assertEquals(expected_count,actual1);
		assertEquals(expected_price,actual2);

}
}

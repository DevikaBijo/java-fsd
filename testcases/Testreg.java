package ustbatchno3.junit5testcase;


import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testreg {
	@Test
	 public void test() {
		List expected=Arrays.asList("Tamilnadu","KALLAR");
		String no="TN05BM6767";
		List actual1=RegDetails.sdataset(no);
		System.out.println(actual1);
		 assertEquals(expected,actual1);
		
	}
	}
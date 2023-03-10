/**
 * 
 */
package ustbatchno3.junit5testcase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

/**
 * @author Administrator
 *
 */
//number is even

public class Testevenorodd {
	@Test
	public void testEven(){
		int number=10;
		boolean result =isEven(number);
		assertTrue(result);
	}
	
	public void testOdd(){
			int number=10;
			boolean result =isEven(number);
			assertFalse(result);
		}
		
 public boolean isEven(int number)
 {
	 return (number%2)==0;
 }

}

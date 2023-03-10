/**
 * 
 */
package ustbatchno3.junit5testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class Testvowelcount {
	
		@Test
		public void counttesting() {

		  String str ="Devika";
		  int expected=3;
		  int actual=Countvowel.vowelscount(str);
		  assertEquals(expected,actual);

		  }
		
}



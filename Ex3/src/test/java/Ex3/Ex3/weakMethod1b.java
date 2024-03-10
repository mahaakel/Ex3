package Ex3.Ex3;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class weakMethod1b {
	
	// Test with 100% branch coverage and Error won't be caught here
	
		@Test
		public void weakMethod_Positive() {
			int expected = 1;
			int result = WeakClass.weakMethod1(10, 2);
			assertEquals(expected, result);
		}

		@Test
		public void weakMethod_Negative() {
			int expected = 0;
			int result = WeakClass.weakMethod1(-9, 3);
			assertEquals(expected, result);
		}
	}

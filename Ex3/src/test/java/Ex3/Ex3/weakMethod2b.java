package Ex3.Ex3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class weakMethod2b {
	
	// Test with 100% branch coverage and Error won't be caught here
	
	@Test
	public void weakMethodBranch1() {
		int ans = WeakClass.weakMethod2(8, 2);
		assertEquals(1, ans);
	}

	@Test
	public void weakMethodBranch2() {
		int ans = WeakClass.weakMethod2(-15, 3);
		assertEquals(-1, ans);
		
	}

	@Test
	public void weakMethodBranch3() {
		int ans = WeakClass.weakMethod2(0, 1);
		assertEquals(0, ans);
		
	}
	

}
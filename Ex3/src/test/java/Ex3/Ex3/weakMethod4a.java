package Ex3.Ex3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class weakMethod4a {
	
	
	// Test set for weakMethod4 achieving 100% branch coverage without exposing the fault
	@Test
	public void PositiveResult() {
		int  ans = WeakClass.weakMethod4(3, 1) ;
		assertEquals(1, ans);
	}
	
	@Test
	public void NegativeResult() {
		int ans = WeakClass.weakMethod4(3, -1) ;
		assertEquals(1, ans);
	}
	
	@Test
	public void branch3() {
		int ans = WeakClass.weakMethod4(4,5) ;
		assertEquals(0, ans);
	}
}
	
	
	
package Ex3.Ex3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class weakMethod3b {
	
	// 100% branch coverage and exposing the fault
	
	@Test
	public void NegativeAnswer() {
		int ans =WeakClass.weakMethod3(5, -5);
		assertEquals(-1, ans);
	}
	
	@Test
	public void PositiveAnswer() {
		int ans =WeakClass.weakMethod3(0, 3);
		assertEquals(1, ans);
	}

	
	@Test
	public void PositiveNotZero() {
		int ans =WeakClass.weakMethod3(10, 5);
		assertEquals(1, ans);
	}

	@Test(expected = ArithmeticException.class)
	public void Error() {
		WeakClass.weakMethod3(2, 0);
	}

}

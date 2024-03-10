package Ex3.Ex3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class weakMethod3a {
	// Not achieving 100% condition coverage  Test with 100%  coverage
	@Test
	public void PosResult() {
		int ans = WeakClass.weakMethod3(0, 5);
		assertEquals(1, ans);
	}

	@Test
	public void NegResult() {
		int ans =  WeakClass.weakMethod3(-1, 5);
		assertEquals(-1, ans);
	}
}

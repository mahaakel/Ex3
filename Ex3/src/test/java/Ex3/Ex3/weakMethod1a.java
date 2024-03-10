package Ex3.Ex3;

import org.junit.Test;

import Ex3.Ex3.WeakClass;

public class weakMethod1a {
	
	// Error will be caught here. Test with less than 100% coverage
	@Test(expected = ArithmeticException.class)
	public void WeakMethodZero1() {
		WeakClass.weakMethod1(10, 0);
	}

}

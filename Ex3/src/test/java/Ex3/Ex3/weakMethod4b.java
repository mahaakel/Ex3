package Ex3.Ex3;


import static org.junit.Assert.assertEquals;

import org.junit.Test;


//// Test set for weakMethod4 achieving less than 100% condition coverage exposing the fault
public class weakMethod4b {

	@Test(expected = ArithmeticException.class)
	public void Error() {
		WeakClass.weakMethod4(1, 0);
	}

}

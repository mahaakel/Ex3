package Ex3.Ex3;

import org.junit.Test;

import Ex3.Ex3.WeakClass;

public class weakMethod2a {
	
	// Division by zero error
	@Test(expected = ArithmeticException.class)
	public void WeakMethodZero2() {
		WeakClass.weakMethod2(5,0);
	}

}

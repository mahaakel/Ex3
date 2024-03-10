package Ex3.Ex3;

public class WeakClass {
	
	
	//weakMethod1
	public static int  weakMethod1(int x, int y) {
		
		double result = x / y;
		if (result > 0)
			  return 1;
		else
			  return 0;
	}

	
	//weakMethod2
	public static int weakMethod2(int x, int y) {
		
		double result = x / y;
		if (result > 0)
			return 1;
		else if (result < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	
	//weakMethod3
	public static int weakMethod3(int x, int y) {
		if (x == 0)
			x += 5;
		
		if (y == 3)
			y += 2;
		double result = x / y;
		if (result > 0)
			return 1;
		else
			return -1;

	}

	
	//weakMethod4
	public static int weakMethod4(int x, int y) {
		
		if (x==3 || y==0) {
			int r = x/y;
			if (r>0 || r<0)
				return 1;
		}
		else 
			return 0;
		return 0;
		
	
		
	}
}
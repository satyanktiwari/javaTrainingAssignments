package dayEightteen.exceptionHandling;

public class ThrowsKeyword {
	
	public static void m1() {
		m2();
	}
	
	public static void m2() {
		try {
			m3();
		} catch (ArithmeticException e) {
			System.out.println("Division by zero");
			e.printStackTrace();
		}
	}
	
	public static void m3() throws ArithmeticException {
		int i=9/0;
	}
	

	public static void main(String[] args) {
		ThrowsKeyword.m1();

	}

}

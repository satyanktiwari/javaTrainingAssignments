package dayEightteen.exceptionHandling;

public class TryCatchKeyword {

	public static void main(String[] args) {
		
		int i = 0;
		int k[] = new int[2];
		
		try {
			k[4]= 20;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Check Array index");
			e.printStackTrace();
		}
		try {
			i = 9/0;
		} catch (ArithmeticException e) {
			System.out.println("Check for division by zero");
			e.printStackTrace();
		}finally {
			System.out.println("this is always executed");
			//unless System.exit(1) is used to stop jvm
		}

	}

}

package dayEightteen.exceptionHandling;

public class ThrowKeyword {

	public static void getData() {
		String data = null;
		
		if (data == null) {
			System.out.println("No data for test case");
//			custom exception using throw
			try {
				throw new Exception("Data NA in spreadsheet");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThrowKeyword.getData();

	}

}

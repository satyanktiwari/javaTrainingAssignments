package DayFourteenbuilderPattern;

public class BuilderPatternEcomm {

	public static void main(String[] args) {
		// Same object can be used for different cases
		// Different workflow can be created by chaining different methods.
		
		Ecomm e1 = new Ecomm();
		
		e1.login("testUn", "testPwd")
		.search("In1b")
		.search("mobile", 10000)
		.addToCart("In1b")
		.payment("test1@okhdfcbank", "123", "4444")
		.generateOrderId()
		.emailGeneratedOrderIdTo("test1@test.com\n");
		System.out.println("_______________________\nDetails for use case 2\n");
		e1.login();
		
		System.out.println("_______________________\nDetails for use case 3\n");
		e1.login().search("cars");
		
		System.out.println("_______________________\nDetails for use case 4\n");
		e1.generateOrderId().getOrderID();

	}

}

package DayFourteenbuilderPattern;

public class Ecomm {
	private int orderID;
	//login
	public Ecomm login() {
		System.out.println("You are logged in\n");
		return this;
	}
	
	//login with un and pwd
	public Ecomm login(String un, String pwd) {
		System.out.println("Logged in with User Name: "+ un);
		return this;
	}
	
	//search
	public Ecomm search(String searchText) {
		System.out.println("Here are your results for "
							+ searchText);
		return this;
	}
	
	//search with price
	public Ecomm search(String searchText, int price) {
		System.out.println("Here are your results for "
							+ searchText + 
							"price starting "+ price);
		return this;
	}
	//add to cart
	public Ecomm addToCart(String item) {
		System.out.println("Following item added to cart "
							+ item);
		return this;
	}
	
	//payment cc cvv
	public Ecomm payment(String cc, String cvv) {
		System.out.println("Payment completed with: "+cc+
				"-"+cvv);
		return this;
		
	}
	//payment cc cvv otp
	public Ecomm payment(String cc, String cvv, String otp) {
		System.out.println("Payment completed with: "+cc+
				"-"+cvv+
				"-"+otp);
		return this;
		
	}
	//payment cc/upi
	public Ecomm payment(String cc) {
		System.out.println("Payment completed with: "+cc);
		return null;
		
	}
	//generate order id
	public Ecomm generateOrderId() {
		System.out.println("Order ID is: "+ 12345);
		this.orderID = 12345;
		return this;
	}
	
	
	
	public int getOrderID() {
		return this.orderID;
	}

	//email generated order id
	public Ecomm emailGeneratedOrderIdTo(String email) {
		System.out.println("Email sent to: "+ email);
		return this;
	}
}

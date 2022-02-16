package DayFourteenbuilderPattern;

public class CarBookingApp {
	private int otp;
	
	//login
	public CarBookingApp login() {
		System.out.println("You are logged in");
		return this;
	}
	
	//login with user name and password
	
	public CarBookingApp login(String uname, String password) {
		System.out.println("Logged in with "+ uname);
		return this;
		
	}
	
	//search
	public CarBookingApp search(String location) {
		System.out.println("Your search for location " 
					+ location +" returned following results");
		return this;
	}
	
	//search with specific car
	public CarBookingApp search(String text, String type) {
		System.out.println("Your search cirteria " + text
				+" for car type "+ type+" returned following results");
		return this;
	}
	
	//confirm booking
	public CarBookingApp tapConfirmBooking() {
		System.out.println("Please proceed with the payment");
		return this;
	}
	
	//payment with cc cvv
	public CarBookingApp payment(String CC, String cvv) {
		System.out.println("Payment completed");
		return this;
	}
	
	//payment with cc cvv and otp
	public CarBookingApp payment(String CC, String cvv, String otp) {
		System.out.println("Payment completed");
		return this;
	}
	
	//notify car has arrived
	public CarBookingApp notificationCarArrived() {
		this.otp=1234;
		System.out.println("Your ride has arrived. "
				+ "Please share the OTP"+ otp +" with the driver");
		return this;
		
	}
	
	//Travel completed
	public CarBookingApp notificationDestinationReached() {
		System.out.println("You have reached the destination");
		return this;
	}

}

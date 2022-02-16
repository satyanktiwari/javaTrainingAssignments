package DayFourteenbuilderPattern;

public class BuilderPatternBookingApp {
	public static void main(String[] args) {
		CarBookingApp car1 = new CarBookingApp();
		// use case 1
		car1.login().search("Kondhwa").tapConfirmBooking().payment("abcd123456", "1234").notificationCarArrived()
				.notificationDestinationReached();
		System.out.println("----------------------------------------\n");
		// use case 2
		car1.login().search("Kondhwa","mini").tapConfirmBooking().payment("abcd123456", "1234").notificationCarArrived()
				.notificationDestinationReached();
		System.out.println("----------------------------------------\n");
		// use case 3 - payment not made
		car1.login().search("Kondhwa","mini").tapConfirmBooking();
		System.out.println("----------------------------------------\n");
		// use case 4 - only search
		car1.login().search("Kondhwa","mini");
	}

}

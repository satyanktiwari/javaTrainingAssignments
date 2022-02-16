package DayFifteenInheritance;

public class BMW extends Car{
	@Override
	public void start() {
		System.out.println("Bmw is starting");
	}
	
	@Override
	public void stop() {
		System.out.println("BMW stopped");
	}
	
	public void speed() {
		System.out.println("BMW is fast");
	}
	

}

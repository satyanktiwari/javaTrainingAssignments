package accessModifier;

public class Car extends Machine{

	@Override
	public void stop() {
		System.out.println("Car is stopping");
	}

	@Override
	void running() {
		System.out.println("Car is running");
	}
	
}

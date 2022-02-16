package accessModifier;

public class Machine {
	private void start() {
		System.out.println("Private start method in machine");

	}
	
	protected void stop() {
		System.out.println("Protected stop method in machine");
	}
	
	void running() {
		System.out.println("Machine with default access modifier");
	}
}

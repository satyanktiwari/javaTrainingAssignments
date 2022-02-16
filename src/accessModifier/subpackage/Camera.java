package accessModifier.subpackage;

import accessModifier.Machine;

public class Camera extends Machine{
	/*
	 * private and protected method is not accessible here
	 * since this is different package
	 * default method can be accessed here
	 */

	@Override
	public void stop() {
		System.out.println("Camera is stopped");
	}
	
	public void start() {
		System.out.println("Camera starting");
	}
	
}

package accessModifier;

import accessModifier.subpackage.Camera;

public class AccessModifierMethodsImplementation {
	private static void seperator(Object obj) {
		System.out.println("________________\n"+obj.toString());
	}

	public static void main(String[] args) {
		Car audi = new Car();
		seperator(audi);
		audi.running();
		audi.stop();
		
		Machine car1 = new Machine();
		seperator(car1);
		car1.running();
		car1.stop();
		
		Camera cam1 = new Camera();
		seperator(cam1);
		cam1.start();
		cam1.stop();
		
		//upcasting
		Machine car2 = new Car();
		seperator(car2);
		car2.running();
		car2.stop();
		
		//downcasting
		Machine car3 = new Car();
		Car maruti = (Car)car3;
		seperator(maruti);
		maruti.running();
		maruti.stop();
		

	}
	
	

}

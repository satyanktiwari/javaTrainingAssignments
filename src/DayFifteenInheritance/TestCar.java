package DayFifteenInheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b1 = new BMW();
		b1.start();
		b1.speed();
		b1.stop();
		//b1.wheels() can't access from this object
		
		/*
		 * Reference variable of type car is pointing to
		 * object of type BMW (child class object)
		 */
		System.out.println("\n-----------------");
		//Up-casting
		Car c1 = new BMW();
		c1.start();
		c1.wheels();
		c1.stop();
		//c1.speed(); // individual methods of child class can't be accessed
		
		/*
		 * reference variable of type car is pointing to the
		 * reference variable of type BMW
		 */
		System.out.println("\n-----------------");
		Car c2 = b1;
		c1.start();
		c1.wheels();
		c1.stop();
		
		System.out.println("\n--------Down-Casting---------");
		//To avoid java.lang.ClassCastException
		// in down-casting
		/*
		 * parent reference variable poining to child class object
		 * Reference variable of type child pointing to 
		 * 	Parent class object
		 * Then reference variable of type child can access all methods oc
		 * parent and also child
		 */
		Car car3 = new BMW();
		BMW BMW3 = (BMW)car3;
		BMW3.start();
		BMW3.speed();
		BMW3.wheels();
		BMW3.stop();
		
		
		
	}

}

package interfaceClass;
import prog2Interface.*;

/*
   2. Create an interface with at least one method, in its own package. Create a class in a
		separate package. Add a protected inner class that implements the interface. In a third
		package, inherit from your class and, inside a method, return an object of the protected
		inner class, up casting to the interface during the return.
 */

public class Prog2 {

	protected class innerProg2 implements interfaceProg2{

		public innerProg2() {
			
		}

		public void method1() {
			
			
		}
		
	}
	
	public static void main(String[] args) {

	}

}

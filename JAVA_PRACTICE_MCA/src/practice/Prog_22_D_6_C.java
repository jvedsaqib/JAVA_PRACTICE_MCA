package practice;
/*
 * Create a private inner class that implements a public interface. Write a method that
	returns a reference to an instance of the private inner class, up cast to the interface.
	Show that the inner class is completely hidden by trying to downcast it.
 */

interface interfaceA{
	
}

class OuterClass {
	  int x = 10;
	  OuterClass(){
		  System.out.println("Outer Class");
	  }

	  class InnerClass implements interfaceA {
	    int y = 5;
	    InnerClass(){
	    	System.out.println("Inner Class");
	    }
	  }
	}


public class Prog_22_D_6_C {

	public static void main(String[] args) {
		OuterClass outerOb = new OuterClass();
		OuterClass.InnerClass innerOb = outerOb.new InnerClass();
	}

}

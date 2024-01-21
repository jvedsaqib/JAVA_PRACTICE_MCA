package practice;

class SingletonA{
	private static SingletonA ob;
	private SingletonA(){
		
	}
	
	public static SingletonA get() {
		if(ob == null)
			ob = new SingletonA();
		return ob;
	}
	
}

public class SingletonDemo {

	public static void main(String[] args) {
		
		// SingletonA ob = new SingletonDemo();		--> error

		SingletonA ob = SingletonA.get();
		System.out.println("Instance ob = " + ob);

		SingletonA ob2 = SingletonA.get();
		System.out.println("Instance ob2 = " + ob2);
		
		/*
		 * OUTPUT - 
		 * Instance ob = practice.SingletonA@5e265ba4
		 * Instance ob2 = practice.SingletonA@5e265ba4
		 */

	}

}

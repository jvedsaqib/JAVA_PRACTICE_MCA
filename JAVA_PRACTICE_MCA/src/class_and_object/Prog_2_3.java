package class_and_object;

/*
 * 3. Write a program that defines a class with one static variable called cnt. Create two or more
objects of the class. The class also contains a method that increments the cnt variable
whenever a new instance of the class is created. Write a driver class to test the above class.
 */

class ObjectCount{
	static int cnt = 0;
	
	public ObjectCount() {
		this.createObject();
	}
	
	public void createObject() {
		cnt++;
	}
	
}

public class Prog_2_3 {

	public static void main(String[] args) {
		
		ObjectCount o1 = new ObjectCount();
		ObjectCount o2 = new ObjectCount();
		ObjectCount o3 = new ObjectCount();
		ObjectCount o4 = new ObjectCount();
		ObjectCount o5 = new ObjectCount();
		
		System.out.println(o1.cnt);

	}

}

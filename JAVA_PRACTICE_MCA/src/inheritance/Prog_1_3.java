package inheritance;

/*
  	3. Write a program to create a class named Vehicle having protected instance variables
		regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a vehicle
		class”. Inherit the Vehicle class into subclasses named Bus and Car having individual private
		instance variables routeNumber in Bus and manufacturerName in Car and both of them
		having showData ( ) method showing all details of Bus and Car respectively with content of
		the super class’s showData ( ) method.
 */

class Vehicle{
	protected String regnNumber;
	protected int speed;
	protected String color;
	protected String ownerName;
	
	public Vehicle(String regnNumber, int speed, String color,
			String ownerName) {
		this.regnNumber = regnNumber;
		this.speed = speed;
		this.color = color;
		this.ownerName = ownerName;
	}
	
	void showData(){
		System.out.println("This is a vehicle class");
	}
}

class Bus extends Vehicle{
	
	private String routeNumber;

	public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
		super(regnNumber, speed, color, ownerName);
		this.routeNumber = routeNumber;
	}
	
	void showData(){
		System.out.println("-- BUS DETAILS --");
		System.out.println("Bus regnNumber : " + this.regnNumber);
		System.out.println("Bus speed : " + this.speed);
		System.out.println("Bus color : " + this.color);
		System.out.println("Bus Owner Name : " + this.ownerName);
		System.out.println("Bus Route Number : " + this.routeNumber);
	}
	
}

class Car extends Vehicle{
	
	private String manufacturerName;

	public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
		super(regnNumber, speed, color, ownerName);
		this.manufacturerName = manufacturerName;
	}
	
	void showData(){
		System.out.println("-- CAR DETAILS --");
		System.out.println("Car regnNumber : " + this.regnNumber);
		System.out.println("Car speed : " + this.speed);
		System.out.println("Car color : " + this.color);
		System.out.println("Car Owner Name : " + this.ownerName);
		System.out.println("Car Manufacturer Name : " + this.manufacturerName);
	}
	
}

public class Prog_1_3 {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("WB01", 150, "N/A", "N/A");
		v1.showData();
		
		Bus b1 = new Bus("WB01 AX 8829", 140, "WHITE", "DISHA", "BARASAT-GARIA");
		b1.showData();
		
		Car c1 = new Car("WB01 AV 1001", 200, "BLACK", "SAQIB", "BMW");
		c1.showData();

	}

}

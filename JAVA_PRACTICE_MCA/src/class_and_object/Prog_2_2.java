package class_and_object;
import java.util.*;

/*
 * 2. Create two classes DM and DB which store the value of distances. DM stores distances in
		meters and centimeters and DB in feet and inches. Write a program that can read values for
		the class objects and add one object of DM with another object of DB. Use method to carry
		out the addition operation. The object that stores the result may be a DM object or a DB
		object, depending on the units in which the results are required. The display should be done
		in the format of feet and inches or meters and centimeters depending on the object on
		display.
 */


class DM{
	double meters;
	double centimeters;
	
	
	public DM(double meters, double centimeters) {
		this.meters = meters;
		this.centimeters = centimeters;
	}
	
	public DM add(DB ob) {
		
		double meters = (this.meters + ob.feet * 0.3048);			// 1 ft = 0.3048 m
		double centimeters = (this.centimeters + ob.inches * 2.54);	// 1 in = 2.54 cm
		
		return new DM(meters, centimeters);
	}

}

class DB{
	double feet;
	double inches;
	
	public DB(double feet, double inches) {
		this.feet = feet;
		this.inches = inches;
	}
	
	public DB add(DM ob) {
		
		double feet = (this.feet + ob.meters * 3.28084);			// 1 m = 3.28084 ft
		double inches = (this.inches + ob.centimeters * 0.393701);	// 1 cm = 0.393701 in
		
		return new DB(feet, inches);
	}
	
}

public class Prog_2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DM obDM;
		DB obDB;
		
		System.out.println("input for DM object : -");
		System.out.print("Meters - "); 
		double meters = sc.nextDouble();
		
		System.out.print("Centimeters - "); 
		double centimeters = sc.nextDouble();
		
		obDM = new DM(meters, centimeters);
		
		System.out.println("input for DB object : -");
		System.out.print("Feet - "); 
		double feet = sc.nextDouble();
		
		System.out.print("Inches - "); 
		double inches = sc.nextDouble();
		
		obDB = new DB(feet, inches);
		
		int choice = 0;
		
		System.out.println("1) DB(feet, inches)\t2) DM(meters, centimeters)");
		System.out.println("-- Enter which addition you want to perform --");
		choice = sc.nextInt();
		
		switch(choice){
		case 1:
			DB temp1 = obDB.add(obDM);
			System.out.println("Feet - " + temp1.feet + " , " + "Inches - " + temp1.inches);
			break;
		case 2:
			DM temp2 = obDM.add(obDB);
			System.out.println("Meters - " + temp2.meters + " , " + "Centimeters - " + temp2.centimeters);
			break;
		}
		
		sc.close();

	}

}

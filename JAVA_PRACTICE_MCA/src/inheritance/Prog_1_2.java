package inheritance;

/*
 * 2. Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone
		from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). Override
		these two methods in each of the derived classes to calculate the volume and whole surface
		area of each type of three-dimensional objects. The dimensions of the objects are to be taken
		from the users and passed through the respective constructors of each derived class. Write a
		main method to test these classes.
 */

abstract class ThreeDObject{
	
	double w, l, h;
	
	ThreeDObject(double w, double l, double h) {
		this.w = w;
		this.l = l;
		this.h = h;
	}
	abstract double wholeSurfaceArea();
	abstract double volume();
	
}

class Box extends ThreeDObject{
	
	Box(double w, double l, double h){
		super(w, l, h);
	}
	
	double wholeSurfaceArea(){
		return (2 * l * w) + (2 * l * h) + (2 * w * h);
	}

	double volume() {
		return l * h * w;
	}
	
}

class Cube extends ThreeDObject{

	Cube(double w, double l, double h) {
		super(w, l, h);
	}

	double wholeSurfaceArea() {
		return 6 * l * l;
	}

	double volume() {
		return l*l*l;
	}
	
}

class Cylinder extends ThreeDObject{

	Cylinder(double w, double l, double h) {
		super(w, l, h);
	}

	double wholeSurfaceArea() {
		return (2 * Math.PI * w * h) + (2 * Math.PI * w * w);
	}

	double volume() {
		return Math.PI * w * w * h;
	}
	
}

class Cone extends ThreeDObject{

	Cone(double w, double l, double h) {
		super(w, l, h);
	}

	@Override
	double wholeSurfaceArea() {
		return (Math.PI * w * (w + Math.sqrt(h*h + w*w)));	
	}

	double volume() {
		return ((double)1/3 * Math.PI) * w * w * h;
	}
	
}


public class Prog_1_2 {
	public static void main(String[] args) {
		Box b = new Box(2, 3, 1);
		System.out.println("BOX - ");
		System.out.println("SA - " + b.wholeSurfaceArea());
		System.out.println("V - " + b.volume());
		
		Cube c = new Cube(2, 2, 2);
		System.out.println("CUBE - ");
		System.out.println("SA - " + c.wholeSurfaceArea());
		System.out.println("V - " + c.volume());

		Cylinder cy = new Cylinder(2, 2, 3);
		System.out.println("CYLINDER - ");
		System.out.println("SA - " + cy.wholeSurfaceArea());
		System.out.println("V - " + cy.volume());
		
		Cone co = new Cone(2, 2, 3);
		System.out.println("CONE - ");
		System.out.println("SA - " + co.wholeSurfaceArea());
		System.out.println("V - " + co.volume());
		
	}

}

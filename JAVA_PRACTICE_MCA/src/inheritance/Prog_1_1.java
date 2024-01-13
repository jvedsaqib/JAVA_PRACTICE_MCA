package inheritance;


/*
 * 1. Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle
		and Square. Use Quadrilateral as the super class of the hierarchy. Specify the instance
		variables and methods for each class. The private instance variables of Quadrilateral should
		be the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that
		instantiates objects of your classes and outputs each object's area (except Quadrilateral). 
 */


class Quadrilateral{
	
	int x1, y1;
	int x2, y2;
	int x3, y3;
	int x4, y4;
	
	double side1, side2, side3, side4;
	
	Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3,
			int x4, int y4) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		
		this.side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		this.side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		this.side3 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		this.side4 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));
		
	}
	
	
	
}

class Trapezoid extends Quadrilateral{
	
	Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	double area(){
		int hX = this.x2;
		int hY = this.y1;
		
		double h = Math.sqrt(Math.pow(this.x2 - this.x2, 2) + Math.pow(this.y2 - this.y1, 2));
		System.out.println(h);
		
		return 0.5 * (this.side2 + this.side4) * h;
		
	}
	
}

class Parallelogram extends Quadrilateral{

	Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	double area(){
		int hX = this.x4;
		int hY = this.y1;
		
		double h = Math.sqrt(Math.pow(this.x4 - this.x4, 2) + Math.pow(this.y4 - this.y1, 2));
		System.out.println(h);
		
		return this.side3 * h;
		
	}
	
}

class Rectangle extends Quadrilateral{

	Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	double area(){
		if(side1 == side3 && side2 == side4){
			return this.side1 * this.side2;
		}
		else
			return this.side1 * this.side3;
	}
	
}

class Square extends Quadrilateral{

	Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	double area(){
		return this.side1 * this.side1;
	}
	
}



public class Prog_1_1 {
	
	public static void main(String[] args) {
		
		/*
		// SQUARE
		Square sq = new Square(1, 1, 3, 1, 3, 3, 1, 3);
		
		System.out.println("Side 1 - " + sq.side1);
		System.out.println("Side 2 - " + sq.side2);
		System.out.println("Side 3 - " + sq.side3);
		System.out.println("Side 4 - " + sq.side4);
		
		System.out.println("Area - " + sq.area());
		
		*/
		
		/*
		// RECTANGLE
		Rectangle rt = new Rectangle(1, 1,
									4, 1,
									4, 3,
									1, 3);
		
		System.out.println("Side 1 - " + rt.side1);
		System.out.println("Side 2 - " + rt.side2);
		System.out.println("Side 3 - " + rt.side3);
		System.out.println("Side 4 - " + rt.side4);
		
		System.out.println("Area - " + rt.area());
		
		*/
		
		/*
		//TRAPEZOID 
		Trapezoid tp = new Trapezoid(1, 1,
									2, 3,
									5, 3,
									6, 1);

		System.out.println("Side 1 - " + tp.side1);
		System.out.println("Side 2 - " + tp.side2);
		System.out.println("Side 3 - " + tp.side3);
		System.out.println("Side 4 - " + tp.side4);
		
		System.out.println("Area - " + tp.area());
		*/
		
		/*
		//PARALLELOGRAM
		Parallelogram pl = new Parallelogram(1, 1,
				4, 1,
				5, 3,
				2, 3);

		System.out.println("Side 1 - " + pl.side1);
		System.out.println("Side 2 - " + pl.side2);
		System.out.println("Side 3 - " + pl.side3);
		System.out.println("Side 4 - " + pl.side4);
		
		System.out.println("Area - " + pl.area());
		*/	
		
	}

}

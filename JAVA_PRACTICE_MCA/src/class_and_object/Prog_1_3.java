package class_and_object;
import java.util.*;

/**
 * 3. Write a program to print the area of a rectangle by creating a class named 'Area' having two
		methods. First method named as 'setDim' takes length and breadth of rectangle as parameters
		and the second method named as 'getArea' returns the area of the rectangle. Length and breadth
		of rectangle are entered through keyboard.
 */

class Area{
	private double l, b;
	
	public void setDim(double l, double b){
		this.l = l;
		this.b = b;
	}
	
	public double getArea(){
		return l*b;
	}
	
}

public class Prog_1_3 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length -> ");
		int l = sc.nextInt();

		System.out.print("Enter Breadth -> ");
		int b = sc.nextInt();
		
		Area a1 = new Area();
		
		a1.setDim(l, b);
		System.out.println("Area is -> " + a1.getArea());
		
	}

}

package intro_to_programming;
import java.util.*;

public class Prog_1_1 {

	/*
	 * Write a program that reads three coordinate and calculate the side of triangle. 
	 * Check whether these numbers can be considered as the three sides of a triangle. 
	 * If so, find the type (isosceles, equilateral or right-angled) and area of the triangle.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, x3, y1, y2, y3;
		int side1, side2, side3;
		
		System.out.println("-- Enter sides coordinates -- ");
		System.out.println("-- POINT 1 -- ");
		
		System.out.print("x1 = ");
		x1 = sc.nextInt();
		
		System.out.print("y1 = ");
		y1 = sc.nextInt();
		
		System.out.println("-- POINT 2 -- ");
		
		System.out.print("x2 = ");
		x2 = sc.nextInt();
		
		System.out.print("y2 = ");
		y2 = sc.nextInt();
		
		System.out.println("-- POINT 3 -- ");
		
		System.out.print("x3 = ");
		x3 = sc.nextInt();
		
		System.out.print("y3 = ");
		y3 = sc.nextInt();
		
		side1 = (int) Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		side2 = (int) Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2));
		side3 = (int) Math.sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2));
		
		System.out.println("SIDE 1 = " + side1 + "\n" + "SIDE 2 = " + side2 + "\n" + "SIDE 3 = " + side3);
		
		double area = (0.5) * Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)));
		System.out.println("Area = " + area);
		
		if(Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2) || 
				Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2) ||
					Math.pow(side3, 2) == Math.pow(side2, 2) + Math.pow(side1, 2)){
			System.out.println("Right Angle Triangle");
		}
		
//		side1 = side2 = side3 = 6;
		
		if(side1 == side2 && side2 == side3 && side3 == side1){
			System.out.println("equilateral Triangle");
		}else if(side1 == side2 || side2 == side3 || side3 == side1){
			System.out.println("isosceles Triangle");
		}
		
		
		
			
		

	}

}

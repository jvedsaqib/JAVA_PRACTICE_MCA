package intro_to_programming;
import java.util.*;

public class Prog_1_2 {

	/*
	 * Write a program to find the roots (real and imaginary) of the quadratic equation of the form
	 * ax2 + bx + c = 0.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		double r1, r2;
		
		System.out.print("Enter a = ");
		a = sc.nextInt();
		System.out.print("Enter b = ");
		b = sc.nextInt();
		System.out.print("Enter c = ");
		c = sc.nextInt();
		
		double ds = (b*b) - (4 * a * c);
		
		if(ds == 0){
			r1 = r2 = (-b) / 2*a;
		}else if(ds > 0){
			r1 = ((-b) + Math.sqrt(ds)) / 2*a;
			r2 = ((-b) - Math.sqrt(ds)) / 2*a;
		}else{
			r1 = ((-b)/2*a + Math.sqrt(-ds) / 2*a);
			r2 = ((-b)/2*a - Math.sqrt(-ds) / 2*a);
		}
		
		System.out.println("Roots are : \nR1 = " + r1 + "\nR2 = " + r2);

	}

}

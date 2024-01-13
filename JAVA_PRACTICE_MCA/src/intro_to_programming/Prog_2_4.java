package intro_to_programming;
import java.util.*;

/*
 * The formula for resistors connected in parallel is a little more complex. Given two
	resistors with resistances R1 and R2 connected in parallel the equivalent resistance is
	given by the inverse of the sum of the inverses, i.e. * If there are more than two resistors
	you continue to invert the sum of their inverses; e.g. for four resistors you have: * Write a
	program that calculates the resistance of a group of resistors arranged in parallel.
 */

public class Prog_2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double eqResistance = 1, numerator = 1, denominator = 0;
		
		System.out.println("Enter number of resistors = ");
		int numOfResistors = sc.nextInt();
		
		double valOfResistors[] = new double[numOfResistors];
		
		System.out.println("-- Enter value of resistors --");
		for(int i = 0; i < numOfResistors; i++) {
			System.out.println("Resistor #"+(i+1));
			valOfResistors[i] = sc.nextInt();
		}
		
		System.out.println("---------------------------------------");
		System.out.println("Resistor #" + " \t\t " + "Value\n");
		for(int i = 0; i < numOfResistors; i++) {
			System.out.println((i+1) + " \t\t\t " + valOfResistors[i]);
		}
		
		for(int i = 0; i < numOfResistors; i++) {
			numerator = numerator * valOfResistors[i];
			denominator = denominator + valOfResistors[i];
		}
		//System.out.println(numerator + " --- " + denominator);
		
		eqResistance = numerator / denominator;
		System.out.println("---------------------------------------");
		System.out.println("Equivalent Resistance = "+ eqResistance);
	}

}

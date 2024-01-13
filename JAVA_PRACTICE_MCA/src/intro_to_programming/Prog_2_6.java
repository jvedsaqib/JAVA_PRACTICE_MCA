package intro_to_programming;
import java.util.*;

/*
 * 6. For a certain electrical circuit with an inductance L and resistance R, the damped natural
		frequency is given by:

			Frequency = √ [( 1 / LC ) – ( R^2/4C^2 )]

		It is desired to study the variations of the frequency with C (capacitance). Write a
		program to calculate the frequency of difference values of C starting 0.01 to 0.1 in steps
		of 0.01.
 
 */

public class Prog_2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double L, R, freq;
		
		System.out.print("Enter inductance(L) = ");
		L = sc.nextDouble();
		
		System.out.print("Enter resistance(R) = ");
		R = sc.nextDouble();
		
		double C = 0.01;
		
		
		System.out.println("capacitance(C) \t\t\t frequency");
		for(double i = 0.01; i <= 0.1; i = i + 0.01) {
			freq = Math.sqrt((1 / L * i) - (Math.pow(R, 2) / 4 * Math.pow(C, 2)));
			
			System.out.println(i + "\t\t\t\t" + freq);
			
		}
		

	}

}

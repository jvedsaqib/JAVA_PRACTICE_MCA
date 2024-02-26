/*
 * 1. Write a recursive function to calculate the gcd of two numbers.
 * Done
 */

package recursion;

public class Prog_1 {
	
	static int gcd(int P, int Q) {
		if(P == 0 && Q == 0)
			return -1;
		else if(P == 0)
			return Q;
		else if(Q == 0)
			return P;
		else
			return gcd(Q, P % Q);
	}

	public static void main(String[] args) {
		
		int P1 = 25;
		int Q1 = 15;
		
		int P2 = 25;
		int Q2 = 14;
		
		System.out.println("GCD of " + P1 + ", " + Q1 + " = " + gcd(P1, Q1));
		System.out.println("GCD of " + P2 + ", " + Q2 + " = " + gcd(P2, Q2));
		
	}

}

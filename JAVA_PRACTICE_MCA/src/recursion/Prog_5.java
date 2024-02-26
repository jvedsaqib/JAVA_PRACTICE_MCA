/*
 * 5. Write a recursive function to find the sum of the following series.
	(a) S= 2 + 4 + 6 + 8 + . . . . . + N (Input N).
	(b) S = 1^2 - 3^2 + 5^2 - 7^2 + ..... + N (Input N).
	(c) S = x^3 - x^3/3 + x^3/9 - x^3/27 + ..... (Input X,N).
 */

package recursion;

public class Prog_5 {
	
	static int sum_a(int N) {
		if(N < 0)
			return 0;
		else
			return 2*N + sum_a(N-1);
	}

	static double sum_b(int N) {
		if(N == 1)
			return 1;
		else
			return (Math.pow(2*N - 1, 2)*Math.pow(-1, N - 1)) + sum_b(N - 1);
	}
	
	static double sum_c(int X, int N) {
		if(N == 1)
			return (1/(Math.pow(3, N-1))) * Math.pow(X, 3);
		else
			return ((1/(Math.pow(3, N-1))) * Math.pow(X, 3))*Math.pow(-1, N - 1) + sum_c(X, N - 1); 
	}
	
	public static void main(String[] args) {
		System.out.println(sum_a(4));
		System.out.println(sum_b(2));
		System.out.println(sum_c(1,2));
		
	}

}

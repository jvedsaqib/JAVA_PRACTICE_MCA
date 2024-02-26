/*
 * 2. Write a recursive function to print the first n Fibonacci numbers.
 * DONE
 */

package recursion;

public class Prog_2 {
	
	static int fibo(int N) {
		if(N < 2)
			return N;
		else
			return fibo(N - 1) + fibo(N - 2);
	}

	public static void main(String[] args) {
		
		int N = 10;
		
		for(int i = 1; i <= N; i++) {
			System.out.println("term #" + i + " = " + fibo(i));
		}
	}

}

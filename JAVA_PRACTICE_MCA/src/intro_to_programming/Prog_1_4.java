package intro_to_programming;

import java.util.Scanner;

public class Prog_1_4 {

	/**
	 * Write a program for determining whether a number is a Perfect number or not.
	 * (e.g. 28 is a Perfect Number because Sum of the Divisor of 28 = 1+2+4+7+14 =28.)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number = ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n/2; i++){
			if(n % i == 0)
				sum = sum + i;
		}
		
		System.out.println(n + "\n" + sum);
		
		if(n == sum)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");

	}

}

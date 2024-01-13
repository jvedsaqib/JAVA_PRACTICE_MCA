package intro_to_programming;

import java.util.Scanner;

public class Prog_1_8 {

	/**
	 * Write a Program to find the sum of all the Prime numbers between a given range of numbers.
	 */
	
	static boolean isPrime(int n) {
		for(int i = 2; i <= n / 2; i++){
			if(n % i == 0)
				return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 2; i < n; i++){
			if(isPrime(i)){
				System.out.print(i + " ");
				sum = sum + i;
			}
				
		}
		
		System.out.println("\n" + sum);
		
	}

}

package intro_to_programming;

import java.util.Scanner;

public class Prog_1_5 {
	

	/**
	 * Write a program to find the prime factors of the given number .
	 * (e.g. Input : 315 Output: 3 5 7)
	 */
	
	static boolean isPrime(int n) {
		for(int i = 2; i < n /2; i++){
			if(n % i == 0)
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int n = sc.nextInt();
		
		
		for(int i = 2; i <= n; i++){
			if(n % i == 0){
				if(isPrime(i))
					System.out.print(i + " ");
			}
				
		}

	}

	

}

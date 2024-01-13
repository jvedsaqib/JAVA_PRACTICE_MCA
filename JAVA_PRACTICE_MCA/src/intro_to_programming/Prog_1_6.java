package intro_to_programming;

import java.util.Scanner;

public class Prog_1_6 {

	/**
	 * Write a program for determining whether a number is a Pearson number or not.
	 * (e.g. 145 is a Pearson number because 1! + 4! + 5! =145.)
	 */
	
	static int facto(int n){
	
		int f = 1;
		
		for(int i = n; i > 0; i--)
			f = f * i;
		
		return f;
	}
	
	static boolean isPearson(int n){
		
		int temp = n;
		int sum = 0;
		
		while(temp > 0){
			int digit = temp % 10;
			System.out.println("Digit = " + digit);
			temp = temp / 10;
			sum = sum + facto(digit);
		}
		
		if(sum == n)
			return true;
		else
			return false;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int n = sc.nextInt();

		System.out.println(isPearson(n));
		
	}

}

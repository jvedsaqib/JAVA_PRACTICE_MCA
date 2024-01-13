package intro_to_programming;

import java.util.Scanner;

public class Prog_1_7 {

	/**
	 * Write a program to find all Armstrong numbers in the range 1 to M,
	 * where M is taken as input.
	 */
	
	static int digitCounter(int n){
		int temp = n;
		int count = 0;
		
		while(temp > 0){
			int digit = temp % 10;
			temp = temp / 10;
			count = count + 1;
		}
		
		return count;
		
	}
	
	static boolean isArmstrong(int n){
		int temp = n;
		int sum = 0;
		int c = digitCounter(n);
		
		while(temp > 0){
			int digit = temp % 10;
			temp = temp / 10;
			sum = (int) (sum + Math.pow(digit, c));
		}
		
		if(n == sum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++){
			if(isArmstrong(i))
				System.out.print(i + " ");
		}
		
	}

}

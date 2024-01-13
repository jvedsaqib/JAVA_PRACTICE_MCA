package intro_to_programming;

import java.util.Scanner;

public class Prog_1_3 {

	/**
	 * The nos. in the sequence 0 1 1 2 3 5 8 13 21............. are called Fibonacci nos.
	 * Write a program to print the first n (to be taken as input) Fibonacci nos.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter term = ");
		n = sc.nextInt();
		
		int n1 = 0, n2 = 1, n3 = 0;
		
		System.out.print("0 0");
		
		for(int i = 2; i< n; i++){
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;
		}
		

	}

}

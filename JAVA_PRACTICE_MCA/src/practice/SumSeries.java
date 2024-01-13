package practice;

public class SumSeries {
	
	static int facto(int n) {
		int fact = 1;
		
		for(int i = n; i > 0; i--)
			fact = fact * i;
		
		return fact;
	}

	public static void main(String[] args) {
		
		int n = 5; // n - terms
		
		int sum = 0;
		
		
		// ---------- Q1 -------------
		// 1 + 2 + 3 + 4 + .... + n 
		
		System.out.print("Terms = ");
		for(int i = 1; i<=n; i++) {
			sum = sum + i;
			System.out.print(" " + i);
		}
		System.out.println("\nSum = " + sum);
		
		// ---------- X -------------

		
		// ---------- Q2 -------------
		// 1 + 3 + 5 + 7 + .... + n 
		
		sum = 0;
		System.out.print("Terms = ");
		for(int i = 1; i<=n; i++) {
			sum = sum + (2*i - 1);
			System.out.print(" " + (2*i - 1));
		}
		System.out.println("\nSum = " + sum);
		
		// ---------- X -------------
		
		// ---------- Q3 -------------
		// 1 - 3 + 5 - 7 + .... n 
		
		sum = 0;
		System.out.print("Terms = ");
		for(int i = 1; i<=n; i++) {
			if(i%2 != 0) {
				sum = sum + (2*i - 1);
				System.out.print(" " + (2*i - 1));
			}else {
				sum = sum - (2*i - 1);
				System.out.print(" " + (2*i - 1));
			}
		}
		System.out.println("\nSum = " + sum);
		
		// ---------- X -------------
		
		// ---------- Q4 -------------
		// 1^2 - 3^2 + 5^2 - 7^2 .... n 
		
		sum = 0;
		System.out.print("Terms = ");
		for(int i = 1; i<=n; i++) {
			if(i%2 != 0) {
				sum = sum + (2*i - 1)*(2*i - 1);
				System.out.print(" " + (2*i - 1)*(2*i - 1));
			}else {
				sum = sum - (2*i - 1)*(2*i - 1);
				System.out.print(" " + (2*i - 1)*(2*i - 1));
			}
		}
		System.out.println("\nSum = " + sum);
		
		// ---------- X -------------
		
		
		// ---------- Q5 -------------
		// 1! - 3! + 5! - 7! .... n! 
		
		sum = 0;
		System.out.print("Terms = ");
		for(int i = 1; i<=n; i++) {
			if(i%2 != 0) {
				sum = sum + facto((2*i - 1));
				System.out.print(" " + facto((2*i - 1)));
			}else {
				sum = sum - facto((2*i - 1));
				System.out.print(" " + facto((2*i - 1)));
			}
		}
		System.out.println("\nSum = " + sum);
		
		// ---------- X -------------
		
		// ---------- Q6 -------------
		// 1/1! - 3/3! + 5/5! - 7/7! .... n! 
		
		sum = 0;
		int x = 5;
		System.out.print("Terms = ");
		for(int i = 1; i<=n; i++) {
			if(i%2 != 0) {
				sum = sum + ((int)Math.pow((x), (2*i - 1))/facto((2*i - 1)));
				System.out.print(" " + (int)Math.pow((x), (2*i - 1))/facto((2*i - 1)));
			}else {
				sum = sum - ((int)Math.pow((x), (2*i - 1))/facto((2*i - 1)));
				System.out.print(" " + (int)Math.pow((x), (2*i - 1))/facto((2*i - 1)));
			}
		}
		System.out.println("\nSum = " + sum);
		
		// ---------- X -------------
		

	}

}

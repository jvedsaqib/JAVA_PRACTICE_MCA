package intro_to_programming;

public class Prog_1_10 {

	/**
	 * Write a program to obtain the sum of the n terms (n and x to be taken from the user) of the following series
	 *  x - x^3/3! + x^5/5! - x^7/7
	 */
	
	static int facto(int n){
		
		int f = 1;
		
		for(int i = n; i > 0; i--)
			f = f * i;
		
		return f;
	}
	
	public static void main(String[] args) {
		int n = 4;
		int x = 1;
		double sum = 0;
		
		
		for(int i = 1; i <= n; i++){
			if(i % 2 == 0){
				sum = sum - (Math.pow(x, (2*i-1)) / facto((2*i-1)));
				System.out.print("-(" + x + "^" + (2*i-1) + " / " + (2*i-1)+"!) ");
			}
				
			else{
				sum = sum + (Math.pow(x, (2*i-1)) / facto((2*i-1)));
				System.out.print("+(" + x + "^" + (2*i-1) + " / " + (2*i-1)+"!) ");

			}
		}

		System.out.println("\n" + sum);

	}

}

package intro_to_programming;

public class Prog_1_9 {

	/**
	 * Write a program to obtain the sum of the n terms (n to be taken from the user)
	 * of the following series 1 - 3^2/2 + 5^3/3 - 7^4/4.................................................
	 */
	public static void main(String[] args) {
		int n = 4;
		double sum = 0;
		
		
		for(int i = 1; i <= n; i++){
			if(i % 2 == 0){
				sum = sum - (Math.pow((2*i-1), i) / i);
				System.out.print("-(" + (2*i-1) + "^"+i + " / " + i+") ");
			}
				
			else{
				sum = sum + (Math.pow((2*i-1), i) / i);
				System.out.print("+(" + (2*i-1) + "^"+i + " / " + i+") ");

			}
		}

		System.out.println("\n"+sum);
		
	}

}

/*
 * 4. Write a recursive function to calculate the sum of all digits of a number entered by the user.
 * DONE
 */

package recursion;

public class Prog_4 {
	
	static int sum(int num) {
		if(num <= 0)
			return 0;
		else
			return num%10 + sum(num/10);
	}

	public static void main(String[] args) {
		System.out.println(sum(534));
	}

}

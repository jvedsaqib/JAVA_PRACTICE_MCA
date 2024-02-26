/*
 * 8. Write a Program to calculate the length of the string using a recursive function.
 */

package recursion;

public class Prog_8 {
	
	static int calcLength(String s) {
		if(s.isEmpty())
			return 0;
		else
			return 1 + calcLength(s.substring(0, s.length() - 1));
	}
	
	
	public static void main(String args[]) {
		
		String s = "ABCDE";
		
		System.out.println(calcLength(s));
		
	}
}

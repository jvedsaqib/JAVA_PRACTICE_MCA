/*
 * // ---------@HITK_MCA_2382031_SaqibJaved-----------
 * 6. Write a method in a separate class to convert an infix expression to its corresponding prefix expression.
 */

package stack_dsa;

import java.util.StringTokenizer;

public class Prog_6 {

	// ------------------MAIN--------------------------
	// ---------@HITK_MCA_2382031_SaqibJaved-----------

	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
		String s = "( A - B / C ) * ( A / K - L )";

		StringTokenizer st = new StringTokenizer(s);
		StackCls revStr = new StackCls(s.length());

		System.out.println(s + "\n");
		
		// Step 1 : Reverse the infix string, while interchanging left and right parentheses

		while (st.hasMoreTokens()) {
			String item = st.nextToken();

			if (item.equals("("))
				item = ")";
			else if (item.equals(")"))
				item = "(";

			revStr.push(item);

		}

		String revS = "";

		while (!revStr.isEmpty()) {
			revS += revStr.pop().toString() + " ";
		}

		// Step 2 : Obtain the postfix expression of the infix expression
		
		String res = Prog_5.infixToPostfix(revS);

		System.out.println("Postfix -> " + res);
		
		// Step 3 : Reverse the postfix expression to get prefix expression

		StringTokenizer st2 = new StringTokenizer(res);
		StackCls revStr2 = new StackCls(res.length());

		while (st2.hasMoreTokens()) {
			String item = st2.nextToken();

			revStr2.push(item);

		}

		String revS2 = "";

		while (!revStr2.isEmpty()) {
			revS2 += revStr2.pop().toString() + " ";
		}

		System.out.println("\nPrefix ->\n\n" + revS2);

	}

}

/*
//------------------OUTPUT--------------------------

	( A - B / C ) * ( A / K - L )
	
	( L - K / A ) * ( C / B - A ) 
	
	Postfix -> 
	
	L K A / - C B / A -
	
	Prefix ->
	
	- A / B C - / A K L 
		
*/

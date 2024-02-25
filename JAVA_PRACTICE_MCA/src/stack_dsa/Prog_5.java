/*
 * // ---------@HITK_MCA_2382031_SaqibJaved-----------
 * 5. Write a method in a separate class to convert an infix expression to its corresponding postfix expression.
 */

package stack_dsa;

import java.util.StringTokenizer;

public class Prog_5 {

	static String spacer(String s) {

		String res = "";

		for (char c : s.toCharArray())
			if (c != '+' && c != '-' && c != '*' && c != '/' && c != '^' && c != '%' && c != '(' && c != ')')
				res += c;
			else
				res += " " + c + " ";

		return res;
	}

	static int prec(String c) {
		if (c.equals("^"))
			return 3;
		else if (c.equals("*") || c.equals("/"))
			return 2;
		else if (c.equals("+") || c.equals("-"))
			return 1;
		else
			return -1;
	}

	static String infixToPostfix(String s) throws StackOverflowException, StackUnderflowException {
		// s = spacer(s);
		StringTokenizer st = new StringTokenizer(s);
		StackCls ob = new StackCls(s.length(), "Stack");

		System.out.println(s);

		String res = "";

		while (st.hasMoreTokens()) {
			String item = st.nextToken();

			if (item.equals("(")) {
				ob.push(item);
			} else if (!item.equals("+") && !item.equals("-") && !item.equals("*") && !item.equals("/")
					&& !item.equals("^") && !item.equals("%") && !item.equals(")")) {
				res += item + " ";
			} else if (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/") || item.equals("^")
					|| item.equals("%")) {
				if (ob.isEmpty() || ob.peek().toString().equals("(")) {
					ob.push(item);
				} else {
					if (prec(item) <= prec(ob.peek().toString())) {
						while ((prec(item) <= prec(ob.peek().toString())) || !ob.peek().toString().equals("(")) {
							res += ob.pop().toString() + " ";
						}
						ob.push(item);
					}

					else
						ob.push(item);
				}
			} else if (item.equals(")")) {
				while (ob.peek().toString().equals("("))
					res += ob.pop().toString() + " ";
			}

		}

		while (!ob.isEmpty() && !ob.peek().toString().equals("("))
			res += ob.pop().toString();

		System.out.println();

		return "\n\n" + res;

	}

	// ------------------MAIN--------------------------
	// ---------@HITK_MCA_2382031_SaqibJaved-----------
	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
		String s = "( A + B * C - D ) + F - G";
//		String s = "( A + B )";
		System.out.println(infixToPostfix(s));

	}

}

/*
//------------------OUTPUT--------------------------

 Infix :-
 	( A + B * C - D ) + F - G


 Postfix :-
	A B C * + D - F + G -
		
*/

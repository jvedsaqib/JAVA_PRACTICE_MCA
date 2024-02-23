/*
 * 3. Write a method in a separate class to evaluate a postfix expression 
 * (Consider more than single digit number as a input).
 */

package stack_dsa;

import java.util.StringTokenizer;

public class Prog_3 {

	static String spacer(String s) {

		String res = "";

		for (char c : s.toCharArray())
			if (c != '+' && c != '-' && c != '*' && c != '/' && c != '^' && c != '%' && c != '(' && c != ')')
				res += c;
			else
				res += " " + c + " ";

		return res;
	}

	static void evaluatePostfix(String s)
			throws StackOverflowException, StackUnderflowException {
		s = spacer(s);
		StringTokenizer st = new StringTokenizer(s);
		StackCls ob = new StackCls(s.length(), "Stack");
		
		System.out.println(s);
		
		while (st.hasMoreTokens()) {
//			System.out.println(st.nextToken());

			String temp = st.nextToken();
			System.out.println("Token = " + temp);

			if (!temp.equals("+") && !temp.equals("-") && !temp.equals("*") && !temp.equals("/")) {

				ob.push(temp);
				System.out.println(ob);
				
			} else {
				String a = ob.pop().toString();
				String b = st.nextToken();

				if(a.matches("-?\\d+") && b.matches("-?\\d+"))
					if(temp.equals("+"))
						ob.push(Integer.valueOf(a) + Integer.valueOf(b));
					else if(temp.equals("-"))
						ob.push(Integer.valueOf(a) - Integer.valueOf(b));
					else if(temp.equals("*"))
						ob.push(Integer.valueOf(a) * Integer.valueOf(b));
					else if(temp.equals("/"))
						ob.push(Integer.valueOf(a) / Integer.valueOf(b));
					else if(temp.equals("^"))
						ob.push(Math.pow(Integer.valueOf(a),Integer.valueOf(b)));
					else if(temp.equals("%"))
						ob.push(Integer.valueOf(a) % Integer.valueOf(a));
				else	
					ob.push(a + b + temp);
				
				System.out.println(ob);
			}
		}
	}

	public static void main(String[] args)
			throws StackOverflowException, StackUnderflowException {
		// A + B --> A B +
		String s = "1+2-5";
		String s1 = "A+B*C";

		evaluatePostfix(s1);

	}

}

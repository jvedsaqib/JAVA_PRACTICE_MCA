/*
 * // ---------@HITK_MCA_2382031_SaqibJaved-----------
 * 
 * 3. Write a method in a separate class to evaluate a postfix expression 
 * (Consider more than single digit number as a input).
 */

package stack_dsa;

import java.util.StringTokenizer;

public class Prog_3 {

	static String spacer(String s) {

		String res = "";

		for (int i = 0; i < s.length(); i++) {

		}

		return res;
	}

	static void evaluatePostfix(String s) throws StackOverflowException, StackUnderflowException {
		System.out.println("String = " + s);
		StackCls operandStack = new StackCls(s.length(), "Operand Stack");

		StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreTokens()) {
			String item = st.nextToken();

			if (!item.equals("+") && !item.equals("-") && !item.equals("*") && !item.equals("/") && !item.equals("^")
					&& !item.equals("%")) {
				System.out.println("Pushed -> " + item);
				operandStack.push(item);
			} else {
				Integer op2 = Integer.valueOf(operandStack.pop().toString());
				Integer op1 = Integer.valueOf(operandStack.pop().toString());

				if (item.equals("+")) {
					System.err.println("Popped -> " + op1);
					System.err.println("Popped -> " + op2);
					operandStack.push(op1 + op2);
					System.out.println("Pushed -> " + op1 + " + " + op2);
					System.out.println(operandStack);
				} else if (item.equals("-")) {
					System.err.println("Popped -> " + op1);
					System.err.println("Popped -> " + op2);
					operandStack.push(op1 - op2);
					System.out.println("Pushed -> " + op1 + " - " + op2);
					System.out.println(operandStack);
				} else if (item.equals("*")) {
					System.err.println("Popped -> " + op1);
					System.err.println("Popped -> " + op2);
					operandStack.push(op1 * op2);
					System.out.println("Pushed -> " + op1 + " * " + op2);
					System.out.println(operandStack);
				} else if (item.equals("/")) {
					System.err.println("Popped -> " + op1);
					System.err.println("Popped -> " + op2);
					operandStack.push(op1 / op2);
					System.out.println("Pushed -> " + op1 + " / " + op2);
					System.out.println(operandStack);
				} else if (item.equals("^")) {
					System.err.println("Popped -> " + op1);
					System.err.println("Popped -> " + op2);
					operandStack.push(Math.pow(op1, op2));
					System.out.println("Pushed -> " + op1 + "^" + op2);
					System.out.println(operandStack);
				} else if (item.equals("%")) {
					System.err.println("Popped -> " + op1);
					System.err.println("Popped -> " + op2);
					operandStack.push(op1 % op2);
					System.out.println("Pushed -> " + op1 + " % " + op2);
					System.out.println(operandStack);
				}

			}

		}

		System.out.println("\n\n---------------OUTPUT----------------");
		System.out.println(operandStack);

	}

	// ------------------MAIN--------------------------
	// ---------@HITK_MCA_2382031_SaqibJaved-----------

	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
		String s = "3 10 5 + *";

		evaluatePostfix(s);

	}

}

/*
//------------------OUTPUT--------------------------
		String = 3 10 5 + *
		Pushed -> 3
		Pushed -> 10
		Pushed -> 5
		Popped -> 5
		Popped -> 10
		Pushed -> 5 + 10
		Operand Stack => 3 15 
		Popped -> 15
		Popped -> 3
		Pushed -> 15 * 3
		Operand Stack => 45 
		
		
		---------------OUTPUT----------------
		Operand Stack => 45 
*/ 
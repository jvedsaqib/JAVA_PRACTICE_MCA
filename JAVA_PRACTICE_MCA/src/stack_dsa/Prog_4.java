/*
	// ---------@HITK_MCA_2382031_SaqibJaved-----------
 * 4. Write a method in a separate class to evaluate a prefix expression. 
 * (Consider more than single digit number as a input)
 */

package stack_dsa;

import java.util.StringTokenizer;

public class Prog_4 {

	// ------------------MAIN--------------------------
	// ---------@HITK_MCA_2382031_SaqibJaved-----------
	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {

		String s = "+ - 2 7 * 8 / 4 12";	// prefix expression

		StackCls revStrStack = new StackCls(s.length());	// using stack to reverse string

		StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreTokens())
			revStrStack.push(st.nextElement());

		String revS = "";

		while (!revStrStack.isEmpty()) {
			revS += revStrStack.pop().toString() + " ";
		}

		System.out.println("Orignal => " + s);
		System.out.println("Reversed => " + revS);

		System.out.println();

		Prog_3.evaluatePostfix(revS);

	}

}

/*
//------------------OUTPUT--------------------------

	Orignal => + - 2 7 * 8 / 4 12
	Reversed => 12 4 / 8 * 7 2 - + 
	
	String = 12 4 / 8 * 7 2 - + 
	Pushed -> 12
	Pushed -> 4
	Popped -> 12
	Popped -> 4
	Pushed -> 12 / 4
	Operand Stack => 3 
	Pushed -> 8
	Popped -> 3
	Popped -> 8
	Pushed -> 3 * 8
	Operand Stack => 24 
	Pushed -> 7
	Pushed -> 2
	Popped -> 7
	Popped -> 2
	Pushed -> 7 - 2
	Operand Stack => 24 5 
	Popped -> 24
	Popped -> 5
	Pushed -> 24 + 5
	Operand Stack => 29 
	
	
	---------------OUTPUT----------------
	Operand Stack => 29 
		
*/ 
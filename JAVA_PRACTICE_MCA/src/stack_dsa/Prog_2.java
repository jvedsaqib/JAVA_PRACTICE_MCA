/*
 * // ---------@HITK_MCA_2382031_SaqibJaved-----------
 * 
 * 2. Write a method in a separate class to check an expression is valid or not.
 */

package stack_dsa;

public class Prog_2 {
	
	
	public static boolean checkExpression(String s) throws StackOverflowException, StackUnderflowException {
		StackCls ob = new StackCls(s.length(), "Expression Stack");
		for(char c : s.toCharArray()) {
			if(c == '(' || c == '{' || c == '[') {
				// System.out.println(c);
				ob.push(c);
			}
		}
		System.out.println(ob);
		
		for(char c : s.toCharArray()) {
			if(c == ')' || c == '}' || c == ']') {
				// System.out.println(c);
				ob.pop();
			}
		}
		
		System.out.println(ob);
//		System.out.println(ob.getTOS());
		if(ob.getTOS() <= 0)
			return true;
		else
			return false;
		
	}

	// ------------------MAIN--------------------------
	// ---------@HITK_MCA_2382031_SaqibJaved-----------
	
	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
		// TRUE CASE :-
//		String expression = "[a+b+(c+d)]";
//		System.out.println(expression);
//		System.out.println(checkExpression(expression));
		
		
		// FALSE CASE :-
		String expression = "[a+b+(c+d)";
		System.out.println(expression);
		System.out.println(checkExpression(expression));
	}

}

/*
// ------------------OUTPUT--------------------------
  	TRUE CASE :-
	   	[a+b+(c+d)]
		Expression Stack => [ ( 
		Expression Stack => 
		true
	FALSE CASE :-
		[a+b+(c+d)
		Expression Stack => [ ( 
		Expression Stack => [ 
		false
*/ 

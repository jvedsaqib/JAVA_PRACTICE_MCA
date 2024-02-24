package stack_dsa;

import java.util.StringTokenizer;

public class Prog_4 {

	// ------------------MAIN--------------------------
	// ---------@HITK_MCA_2382031_SaqibJaved-----------
	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {

		String s = "+ - 2 7 * 8 / 4 12";

		StackCls revStrStack = new StackCls(s.length());
		
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens())
			revStrStack.push(st.nextElement());
		
		String revS = "";
		
		while(!revStrStack.isEmpty()) {
			String temp = "";
			if(revStrStack.getTOS() > 0){
				temp = revStrStack.pop().toString();
			}
			System.out.println(temp);
			revS += temp;
		}

		System.out.println("Orignal => " + s);
		System.out.println("Reversed => " + revS);
		
		// Prog_3.evaluatePostfix(s);

	}

}

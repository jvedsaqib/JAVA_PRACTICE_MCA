/*
 * What is recursion?
 * -> A function calling itself
 * What is recursion function composed of?
 * -> Base Condition to exit + rest of the code
 */

/*
 * Recurrence Relation
 * 
 * Homework (i) ---
 * 
 * f(n) = 1				if n < 1		// base cond
 * 		= n + f(n-1) 	otherwise		// other cond
 * 
 */

/* ------------------------------------------------------------------ */

/*
 * ii) Sum of 1 to 5
 * 
 * 1 + 2 + 3 + 4 + 5
 * 
 * sum(n) = 0	 			if n < 1
 * 		  = n + sum(n - 1) 	otherwise
 * 
 * static int sum(int n) {
		if(n < 1)
			return 0;
		else
			return n + sum(n-1);
	}
 * 
 */




public class Test {
	
	
	// INORDER TRAVERSAL OF TREE 	L - R - Ri
	static void f1(int n) {
		if(n < 1)
			return;
		
		f1(n-1);
		System.out.print(n + " ");
		f1(n-1);
	}
	
	// PREORDER TRAVERSAL OF TREE	R - L - Ri
		static void f2(int n) {
			if(n < 1)
				return;
			
			System.out.print(n + " ");
			f2(n-1);
			f2(n-1);
		}
		
	// POSTORDER TRAVERSAL OF TREE	L - Ri - R
			static void f3(int n) {
				if(n < 1)
					return;
				
				f3(n-1);
				f3(n-1);
				System.out.print(n + " ");
			}
	

	public static void main(String[] args) {
		f1(3);
		System.out.println();
		f2(3);
		System.out.println();
		f3(3);
	}

}

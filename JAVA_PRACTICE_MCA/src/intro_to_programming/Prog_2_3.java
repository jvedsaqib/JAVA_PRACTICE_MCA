package intro_to_programming;
/*
 * 3. Write a program to evaluate, the following investment equation: V=P ( 1 + r )^n
		and print the tables which would give the values of V for various combinations of the
		following values of P, r & n.
			P : 1000,2000,3000,...........,10,000 R : 0.10,0.11,0.12,................0.20
			n : 1,2,3,..............................,10
 */


public class Prog_2_3 {
	
	static double evaluate(int P, double r, int n) {
		double V;
		
		V = P * Math.pow((1 + r), n);
		
		return V;
	}

	public static void main(String[] args) {
		
		double combinations[][] = new double[10][3];
		String subjects[] = {"P", "r", "n"};
		
		for(int i = 0; i < combinations.length; i++) {
			for(int j = 0; j < combinations[0].length; j++) {
				combinations[i][0] = (i+1) * 1000;
				combinations[i][1] = (double)(10 + i)/100;
				combinations[i][2] = (i+1);
			}
		}
		
		for(int i = 0; i<combinations.length; i++) {
			System.out.println("Term #"+(i+1));
			System.out.println(subjects[0] + " \t\t " + 
								subjects[1] + " \t\t " + 
								subjects[2] + " \t\t " + 
								"V=P ( 1 + r )^n");
			
			System.out.println(combinations[i][0] + " \t\t " + 
					combinations[i][1] + " \t\t " + 
					combinations[i][2] + " \t\t " +
					evaluate((int)combinations[i][0], combinations[i][1], (int)combinations[i][2])
								);
			System.out.println("-------------------------------------------------");
		}

	}

}

package intro_to_programming;
import java.util.*;

/*
 * 2. Admission to a professional course is subject to the following conditions:
			(a) marks in Mathematics >= 60 (b) marks in Physics >=50
			(c) marks in Chemistry >=40 (d) Total in all 3 subjects >=200

										(Or)
			Total in Maths & Physics>=150

		Given the marks in the 3 subjects of n (user input) students, write a program to process
		the applications to list the eligible candidates.
 */

public class Prog_2_2 {
	
	static String isEligible(int maths, int phy, int chem) {
	
		if(maths >= 60 && phy >= 50 && chem >= 40 && (maths+phy+chem)>=200 || (maths+phy)>=150)
			return "Yes";
		else
			return "No";
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String subjects[] = {"Mathematics", "Physics", "Chemistry"};
		
		System.out.println("Enter number of students - ");
		int numOfStudents = sc.nextInt();
		
		int marksTable[][] = new int[numOfStudents][3];
		
		System.out.println("-- Enter marks of the students in the following subjects --");
		for(int i = 0; i<numOfStudents; i++) {
			System.out.println("Enter marks of Student #"+(i+1));
			for(int j = 0; j < subjects.length; j++) {
				System.out.println(subjects[j] + " = ");
				marksTable[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\n-- Marks Table --");
		for(int i = 0; i<numOfStudents; i++) {
			System.out.println("Student #"+(i+1));
			System.out.println(subjects[0] + " \t " + 
								subjects[1] + " \t " + 
								subjects[2] + " \t " + 
								"Total all 3" + " \t " + 
								"Maths + Physics" + " \t " + 
								"Eligible");
			
			System.out.println(marksTable[i][0] + " \t\t " + 
								marksTable[i][1] + " \t\t " + 
								marksTable[i][2] + " \t\t " + 
								(marksTable[i][0] + marksTable[i][1] + marksTable[i][2]) + " \t\t " + 
								(marksTable[i][0] + marksTable[i][1]) + " \t\t\t " + 
								isEligible(marksTable[i][0] , marksTable[i][1] , marksTable[i][2]));
			System.out.println("--------------------------------------------------------------------------------------");
		}
		

	}

}

package intro_to_programming;

import java.util.Scanner;

public class Prog_2_1 {

	/**
	 * Given a list of marks (ranging from 0 to 100) of n (user input) students, write a program to
		print the number of students who have obtain marks:
			(a) in the range 81 to 100 (b) in the range 61 to 80
			(c) in the range 41 to 60 (d) in the range 0 to 40
	 */
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int numOfStudents;
		
		System.out.print("Enter total number of students : ");
		numOfStudents = sc.nextInt();
		
		int marks[] = new int[numOfStudents];
		int grade[] = {0, 0, 0, 0};
		
		for(int i = 0; i < numOfStudents; i++){
			System.out.println("Enter marks of Student #"+ (i+1) + " - ");
			marks[i] = sc.nextInt();
		}
		
		for(int i : marks){
			if(i > 81 && i<100)
				grade[0]++;
			else if(i > 61 && i < 80)
				grade[1]++;
			else if(i > 41 && i < 60)
				grade[2]++;
			else
				grade[3]++;
		}
		
		System.out.println("Grade A stundets #"+ grade[0]);
		System.out.println("Grade B stundets #"+ grade[1]);
		System.out.println("Grade C stundets #"+ grade[2]);
		System.out.println("Grade D stundets #"+ grade[3]);

	}

}

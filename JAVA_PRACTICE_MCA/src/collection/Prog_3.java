package collection;

import java.util.*;

/*
 * Write a program that inputs the names of people into different array list, A and B. Array A has N
	number of names while array B has M number of names, with no duplicates in either of them. Merge
	arrays A and B into a single array list C, such that the resulting array list is sorted alphabetically.
	Display all the three arrays list, A, B and C, stored alphabetically.
 */

public class Prog_3 {

	public static void main(String[] args) {
		ArrayList<String> A = new ArrayList<>();
		ArrayList<String> B = new ArrayList<>();
		ArrayList<String> C = new ArrayList<>();
		LinkedHashSet<String> tempA = new LinkedHashSet<>();
		LinkedHashSet<String> tempB = new LinkedHashSet<>();
		ArrayList<String> temp = new ArrayList();
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		int choice;
		while (flag) {
			System.out.println("Select : 0) Exit \n\t 1) Add name to A \t 2) Display names A \n\t "
					+ "3) Add name to B \t 4) Display names B \n\t "
					+ "5) Merge to C \n\t " 
					+ "6) Display All");
			System.out.print("?= ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				flag = false;
				break;

			case 1:
				System.out.print("Enter name -- ");
				sc.nextLine();
				String s = sc.nextLine();
				A.add(s);
				break;

			case 2:
				tempA = new LinkedHashSet<>(A);
				System.out.println(tempA);
				break;

			case 3:
				System.out.print("Enter name -- ");
				sc.nextLine();
				s = sc.nextLine();
				B.add(s);
				break;
				
			case 4:
				tempB = new LinkedHashSet<>(B);
				System.out.println(tempB);
				break;
				
			case 5:
				tempA = new LinkedHashSet<>(A);
				tempB = new LinkedHashSet<>(B);
				tempA.addAll(B);
				temp = new ArrayList(tempA);
				Collections.sort(temp);
				System.out.println(temp);
				break;
				
			case 6:
				System.out.println("A : " + new LinkedHashSet<>(A));
				System.out.println("B : " + new LinkedHashSet<>(B));
				System.out.println("C : " + temp);
				break;

			default:
				System.out.println("INVALID");
			}

		}

		sc.close();
	}

}

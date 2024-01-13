package collection;
import java.util.*;

/*
 * Write a program that reads in a series of first names and stores them in a LinkedList. 
 * Do not store duplicate names. Allow the user to search for a first name.
 */

public class Prog_1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int choice;
		while(flag) {
			System.out.println("Select : 0) Exit \t 1) Add name \t 2) Display names \t 3) Search name");
			System.out.print("?= ");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				flag = false;
				break;
				
			case 1:
				System.out.print("Enter first name -- ");
				sc.nextLine();
				String s = sc.nextLine();
				list.add(s);
				break;
				
			case 2:
				System.out.println(new LinkedHashSet<>(list));
				break;
				
			case 3:
				System.out.print("Looking for -- ");
				sc.nextLine();
				s = sc.nextLine();
				System.out.println(list.contains(s) ? "Found" : "Not Found");
				break;
				
			default:
				System.out.println("INVALID");
			}
			
		}

		sc.close();
	}

}

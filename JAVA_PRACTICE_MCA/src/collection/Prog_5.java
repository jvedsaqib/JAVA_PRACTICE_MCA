package collection;

import java.util.*;

/*
 *	Write a program to find elements which are present in first array and not in second array. 
 */
public class Prog_5 {

	public static void main(String[] args) {

		ArrayList a = new ArrayList<>();
		a.add(1);	a.add("Saqib");		a.add(2);		a.add("Javed");
		
		ArrayList b = new ArrayList<>();
		b.add("Saqib");		b.add(2);
		
//		HashSet setA = new HashSet(a);
//		HashSet setB = new HashSet(b);

		System.out.println("Array1 - " + a);
		System.out.println("Array2 - " + b);
		a.removeAll(b);
		System.out.println("Array1 but not Array2 - " + a);
	

	}

}

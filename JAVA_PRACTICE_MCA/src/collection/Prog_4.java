package collection;
import java.util.*;

/*
 * Write a program to find whether an array is subset of another array or not.
 */

public class Prog_4 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(1);	a.add("Saqib");		a.add(2);		a.add("Javed");
		
		ArrayList b = new ArrayList<>();
		b.add("Saqib");		b.add(2);

		System.out.println(a);
		System.out.println(b);
		System.out.println(a.containsAll(b));;
	}

}

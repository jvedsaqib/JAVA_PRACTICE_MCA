package collection;
import java.util.*;

/*
 * Write a program that uses a StringTokenizer to tokenize a line of text input by the user and places
	each token in a treeSet. Print the elements of the treeSet. 
	[Note: This should cause the elements to be printed in ascending sorted order.]
 */

public class Prog_2 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("apple orange banana mango", " ");
		
		TreeSet<String> ts = new TreeSet<>();
		
		while(st.hasMoreTokens()) {
			ts.add(st.nextToken());
		}
		
		System.out.println(st.countTokens());
		System.out.println(ts);
		
	}

}

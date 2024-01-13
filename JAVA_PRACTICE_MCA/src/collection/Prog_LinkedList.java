package collection;

import java.util.LinkedList;

public class Prog_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> arr = new LinkedList<>();

		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);

		for (Integer i : arr) {
			System.out.print(i + " ");
		}

	}

}

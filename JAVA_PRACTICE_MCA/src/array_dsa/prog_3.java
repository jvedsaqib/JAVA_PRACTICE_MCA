/*
 * 3. Write a Generic method that computes the Second minimum and Second maximum elements
	of an array of type T and returns a pair containing the minimum and maximum value.
	DONE
 */

package array_dsa;

import java.util.*;

public class prog_3<T> {

	public static <T extends Comparable<T>> List<?> secondMinMax(T[] arr) {

		List<T> res = new ArrayList<>();
		Arrays.sort(arr);

		res.add(arr[1]);
		res.add(arr[arr.length - 2]);

		return res;
	}

	static <T> void display(T[] arr) {
		for (T i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	static void display(List<?> arr) {
		for (Object a : arr)
			System.out.print(a + " ");
	}

	// --------------------------------- MAIN
	// ---------------@Saqib---------------------

	public static void main(String[] args) {

		Integer arr[] = { 5, 1, 2, 4, 3 };

		System.out.println("Array -- ");
		display(arr);
		
		System.out.println("Second MinMax -- ");
		display(secondMinMax(arr));

	}

}

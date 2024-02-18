/*
 * 1. Create a Class Search within that implement two Generic method LinearSearch(),
		BinarySearch(). Test your program for different data.
		DONE
 */

package array_dsa;

public class prog_1 {

	static <E> boolean linSearch(E[] a, E key) {

		for (E i : a)
			if (i == key)
				return true;

		return false;
	}

	static boolean binSearch(Comparable arr[], Comparable key) {

		Integer first = 0;
		Integer last = arr.length;
		Integer mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid].compareTo(key) == 1) {
				first = mid + 1;
			} else if (arr[mid].compareTo(key) == 0) {
				System.out.println("Element is found at index: " + mid);
				return true;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}

		if (first > last) {
			System.out.println("Element is not found!");
			return false;
		}
		return false;
	}

	// --------------------------------- MAIN
	// ---------------@Saqib---------------------

	public static void main(String[] args) {

		Integer a[] = { 1, 2, 3, 4, 5, 6 };
		String b[] = { "Apple", "Banana", "Mango", "Orange" };

		System.out.println(linSearch(a, 4));
		System.out.println(linSearch(b, "Mango"));
		System.out.println(binSearch(a, 4));
	}

}

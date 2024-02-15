/*
 * 1. Create a Class Search within that implement two Generic method LinearSearch(),
		BinarySearch(). Test your program for different data.
 */

package array_dsa;

public class prog_1 {

	static boolean linSearch(int[] a, int key) {

		for (int i : a)
			if (i == key)
				return true;

		return false;
	}

	static boolean binSearch(int arr[], int key) {

		int first = 0; 
		int last = arr.length;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
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

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };

		System.out.println(linSearch(a, 4));
		System.out.println(binSearch(a, 4));
	}

}

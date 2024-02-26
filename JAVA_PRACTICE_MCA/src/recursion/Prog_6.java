/*
 * 6. Write a Program to implement Binary Search using a recursive function.
 */

package recursion;

public class Prog_6 {
	
	static int binSearch(int[] arr, int key, int l, int r) {
		int mid = (l + r) / 2;
		
		if(l > r)
			return -1;
		else
			if(arr[mid] == key)
				return 1;
			else if(arr[mid] < key)
				return binSearch(arr, key, l, mid - 1);
			else
				return binSearch(arr, key, mid+1, r);
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		if(binSearch(arr, 3, 0, arr.length) == 1)
			System.out.println("True");
		else
			System.out.println("False");
		
		if(binSearch(arr, 16, 0, arr.length) == 1)
			System.out.println("True");
		else
			System.out.println("False");
			

	}

}

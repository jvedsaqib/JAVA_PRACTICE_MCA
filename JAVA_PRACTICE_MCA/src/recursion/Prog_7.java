/*
 * 7. Write a Program to reverse an array using a recursive function.
 */

package recursion;

public class Prog_7 {

	static String revArr(int[] arr, int N) {
		if(N == 0)
			return ""+arr[0];
		else
			return arr[N] + " " + revArr(arr, N-1);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int N = arr.length - 1;
		System.out.println(revArr(arr, N));
		
	}

}

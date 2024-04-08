package sorting;

import java.util.*;

public class SelectionSort {

	
	public static void selectionSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < n; j++) {
	            if (arr[j] < arr[minIndex]) {
	                minIndex = j;
	            }
	        }
	        // Swap the found minimum element with the first element
	        int temp = arr[minIndex];
	        arr[minIndex] = arr[i];
	        arr[i] = temp;
	        // Print array after each iteration
	        System.out.println("After iteration " + (i + 1) + ": " + Arrays.toString(arr));
	    }
	}

	
	public static void main(String[] args) {
		
		int[] arr = {10, 7, 8, 9, 1, 5};
		
		selectionSort(arr);
	}

}

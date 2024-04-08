package sorting;

import java.util.*;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
			// Print array after each iteration
			System.out.println("After iteration " + i + ": " + Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 7, 8, 9, 1, 5 };

		insertionSort(arr);

	}

}

package sorting;

import java.util.*;

public class MergeSort {
	public static <T extends Comparable<T>> void mergeSort(T[] arr) {
		if (arr == null || arr.length <= 1) {
			return; // Nothing to sort
		}
		mergeSort(arr, 0, arr.length - 1);
	}

	private static <T extends Comparable<T>> void mergeSort(T[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid); // Sort left half
			mergeSort(arr, mid + 1, right); // Sort right half
			merge(arr, left, mid, right); // Merge the sorted halves
		}
	}

	private static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		// temporary arrays
		T[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
		T[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

		int i = 0, j = 0, k = left;
		// Merge the two arrays
		while (i < n1 && j < n2) {
			if (leftArr[i].compareTo(rightArr[j]) <= 0) {
				arr[k++] = leftArr[i++];
			} else {
				arr[k++] = rightArr[j++];
			}
		}
		// Copy remaining elements of leftArr, if any
		while (i < n1) {
			arr[k++] = leftArr[i++];
		}
		// Copy remaining elements of rightArr, if any
		while (j < n2) {
			arr[k++] = rightArr[j++];
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 7, 8, 9, 1, 5 };
		System.out.println("Original array: " + Arrays.toString(arr));
		mergeSort(arr);
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}
}

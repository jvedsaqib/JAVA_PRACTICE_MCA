/*
 * 2. Create a Class BasicSort within that implement three Generic methods 
 * that can implement the - 
 * 		BubleSort(),
 * 		SelectionSort(), 
 * 		InsertionSort() 
 * that can sort of any type of data.
 * DONE
 */

package array_dsa;

class BasicSort {

	Comparable<?>[] bubbleSort(Comparable[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					Comparable<?> temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		return a;
	}

	Comparable<?>[] selectionSort(Comparable[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			int minPos = i;

			for (int j = i + 1; j < a.length; j++) {
				if (a[minPos].compareTo(a[j]) > 0)
					minPos = j;
			}
			if (minPos != i) {
				Comparable<?> temp = a[i];
				a[i] = a[minPos];
				a[minPos] = temp;
			}
		}

		return a;
	}

	Comparable<?>[] insertionSort(Comparable[] a) {

		int n = a.length;
		for (int j = 1; j < n; j++) {
			Comparable<?> key = a[j];
			int i = j - 1;
			while ((i > -1) && (a[i].compareTo(key)) > 0) {
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}

		return a;
	}

}

public class prog_2 {

	static <E> void display(E[] a) {
		for (E i : a)
			System.out.print(i + " ");
	}

	// --------------------------------- MAIN
	// ---------------@Saqib---------------------

	public static void main(String[] args) {

		BasicSort ob = new BasicSort();

		Comparable<?> a[] = { 5, 1, 3, 2, 4 };
		Comparable<?> b[] = { 5.1, 5.2, 5.0 };
		Comparable<?> c[] = { "T", "H", "I" };

		System.out.println("=======BubbleSort=========");

		display(a);
		ob.bubbleSort(a);
		System.out.println();
		display(a);

		System.out.println("\n=======SelectionSort=========");

		display(b);
		ob.selectionSort(b);
		System.out.println();
		display(b);

		System.out.println("\n=======InsertionSort=========");

		display(c);
		ob.selectionSort(c);
		System.out.println();
		display(c);

	}

}

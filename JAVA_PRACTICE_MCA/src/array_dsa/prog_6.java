/*
   6. Write a program to find whether a matrix is orthogonal or not. 
   		Also find the 1-norm of the matrix.	DONE
 */

package array_dsa;

public class prog_6 {

	static void displayMatrix(int[][] a, String msg) {
		System.out.println(msg);
		for (int i[] : a) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static int[][] transposeMatrix(int[][] a) {
		int temp[][] = new int[a[0].length][a.length];

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[0].length; j++) {
				temp[i][j] = a[j][i];
			}
		}

		return temp;
	}

	static int[][] multiplyMatrix(int[][] a, int[][] b) {
		int temp[][] = new int[a.length][b[0].length];

//		System.out.println("a : row - " + a.length + " | col - " + a[0].length);
//		System.out.println("b : row - " + b.length + " | col - " + b[0].length);
//		System.out.println("TEMP : row - " + temp.length + " | col - " + temp[0].length);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int k = 0; k < b[i].length; k++) {
//					System.out.print(a[i][k] + " * " + b[k][j] + " + ");
					temp[i][j] += a[i][k] * b[k][j];
				}
//				System.out.println();
			}
		}

		return temp;
	}

	static boolean isOrthogonal(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j && a[i][j] == 1) {
					continue;
				} else if (i != j && a[i][j] == 0)
					continue;
				else
					return false;
			}
		}

		return true;
	}

	static int norm_i(int[][] a) {
		int sum[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum[i] += a[j][i];
			}
		}

		displayMatrix(a, "Matrix and its norm.....");

		System.out.print("Sum of each column....\n");
		for (int i : sum) {
			System.out.print(i + "\t");
		}

		int max = sum[0];

		for (int i : sum) {
			if (i > max)
				max = i;
		}

		System.out.println("Norm-I = " + max);

		return 0;
	}

	// --------------------------------- MAIN
	// ---------------@Saqib---------------------
	public static void main(String[] args) {

		int a[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 }, };

		displayMatrix(a, "Matrix");

		int[][] b = transposeMatrix(a);
		displayMatrix(b, "Transpose Matrix");

		int[][] c = multiplyMatrix(a, b);
		displayMatrix(b, "Matrix Multiplication");

		System.out.println("\nOrthogonal - " + isOrthogonal(c));

		int d[][] = { { 1, 2, 0 }, { 0, 1, 0 }, { 0, 0, 1 }, };
		norm_i(d);

	}

}

/*
 * OUTPUT -

	Matrix
	1 0 0 
	0 1 0 
	0 0 1 
	Transpose Matrix
	1 0 0 
	0 1 0 
	0 0 1 
	Matrix Multiplication
	1 0 0 
	0 1 0 
	0 0 1 
	
	Orthogonal - true
	Matrix and its norm.....
	1 2 0 
	0 1 0 
	0 0 1 
	Sum of each column....
	1	3	1	Norm-I = 3

 */
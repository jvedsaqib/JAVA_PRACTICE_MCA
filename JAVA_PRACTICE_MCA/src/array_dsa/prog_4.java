/*
	4. Write class SparseMatrix to give a compressed storage representation of a sparse matrix and
		also find the transpose of the sparse matrix (from the compressed representation).
		DONE
 */
package array_dsa;

public class prog_4 {
	
	static class Records{
		int row,col,nz_val;

		public Records(int row, int col, int nz_val) {
			this.row = row;
			this.col = col;
			this.nz_val = nz_val;
		}
		
	}
	
	static boolean isSparseMatrix(int a[][]) {
		int nz = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] != 0)
					nz++;
			}
		}
		if(nz*3 < a.length * a[0].length)
			return true;
		else
			return false;
	}

	static void toSparseMatrix(int a[][]) {
		Records[] r = new Records[a.length * a[0].length];
		int count = 0;
		System.out.println("Row\t\tColumn\t\tNon-Zero Val");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] != 0) {
					r[count] = new Records(i, j, a[i][j]);
					count++;
				}
			}
		}
		
		for(Records temp : r)
			if(temp != null)
				System.out.println(temp.row + "\t\t" + temp.col + "\t\t" + temp.nz_val);
		
		
		System.out.println("Transpose");

		for(int i = 0; i < r.length; i++) {
			for(int j = i; j < r.length - i - 1; j++) {
				if(r[i] != null && r[j] != null && r[i].col > r[j].col ) {
					Records temp = r[i];
					r[i] = r[j];
					r[j] = temp;
					temp = null;
				}
			}
		}
		
		for(Records temp : r)
			if(temp != null)
				System.out.println(temp.row + "\t\t" + temp.col + "\t\t" + temp.nz_val);
		
	}
		
	
// --------------------------------- MAIN ---------------@Saqib---------------------
	public static void main(String[] args) {

		int a[][] = {
				{1,2,5,6},
				{0,1,2,2},		// Not Sparse
				{0,6,1,1},
				{0,0,1,1}
		};
		
		int b[][] = {
				{0,0,0,6},
				{0,9,1,0},		// Sparse
				{2,0,0,0},
				{0,0,0,3}
		};
		
		array_dsa.prog_6.displayMatrix(a, "is Matrix A a sparse matrix?");
		
		if(isSparseMatrix(a))
			toSparseMatrix(a);
		else
			System.out.println("Not SPARSE");
		
		System.out.println("\n");
		
		array_dsa.prog_6.displayMatrix(b, "is Matrix B a sparse matrix?");
		
		if(isSparseMatrix(b))
			toSparseMatrix(b);
		else
			System.out.println("Not SPARSE");
		
	}

}

/*
 * OUTPUT -

	is Matrix A a sparse matrix?
	1 2 5 6 
	0 1 2 2 
	0 6 1 1 
	0 0 1 1 
	Not SPARSE
	
	
	is Matrix B a sparse matrix?
	0 0 0 6 
	0 9 1 0 
	2 0 0 0 
	0 0 0 3 
	Row		Column		Non-Zero Val
	0		3		6
	1		1		9
	1		2		1
	2		0		2
	3		3		3
	Transpose
	2		0		2
	1		1		9
	1		2		1
	0		3		6
	3		3		3

*/

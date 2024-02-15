/*
   5. Write a Class CheckTriangular within that implement methods to check whether a matrix is
		i) Lower triangular ii) Upper triangular iii) Diagonal iv) Identity v) Tridiagonal.
		DONE
 */

package array_dsa;

public class prog_5 {
	
	static boolean isUpperTriangular(int a[][]) {
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(i <= j && a[i][j] != 0) {
					continue;
				}
				else if(i > j && a[i][j] == 0) {
					continue;
				}
				else
					return false;
			}
		}
		
		return true;
	}
	
	static boolean isLowerTriangular(int a[][]) {
			
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[i].length; j++) {
					if(i >= j && a[i][j] != 0) {
						continue;
					}
					else if(i < j && a[i][j] == 0) {
						continue;
					}
					else
						return false;
				}
			}
			
			return true;
		}
	
	static boolean isDiagonal(int a[][]) {
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(i == j && a[i][j] != 0) {
					continue;
				}
				else if(Math.abs((i-j)) > 0  && a[i][j] == 0) {
					continue;
				}
				else
					return false;
			}
		}
		
		return true;
	}
	
	static boolean isIdentity(int a[][]) {
			
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[i].length; j++) {
					if(i == j && a[i][j] == 1) {
						continue;
					}
					else if(Math.abs((i-j)) > 0  && a[i][j] == 0) {
						continue;
					}
					else
						return false;
				}
			}
			
			return true;
		}
	
	static boolean isTridiagonal(int a[][]) {
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(Math.abs((i-j)) <= 1 && a[i][j] != 0) {
					continue;
				}
				else if(a[i][j] == 0) {
					continue;
				}
				else
					return false;
			}
		}
		
		return true;
	}

	
	// --------------------------------- MAIN ---------------@Saqib---------------------
	
	public static void main(String[] args) {
		
		int a[][] = {
				{1,2,3},
				{0,5,6},		// UpperTriangular
				{0,0,9}
		};
		
		int b[][] = {
				{1,0,0},
				{1,5,0},		// LowerTriangular
				{2,3,9}
		};
		
		int c[][] = {
				{1,0,0},
				{0,5,0},		// Diagonal
				{0,0,9}
		};
		
		int d[][] = {
				{1,0,0},
				{0,1,0},		// Identity
				{0,0,1}
		};
		
		int e[][] = {
				{1,2,0,0},
				{3,1,2,0},		// Tridiagonal
				{0,2,1,1},
				{0,0,1,1}
		};
		
		array_dsa.prog_6.displayMatrix(a, "For UpperTriangular");
		System.out.println("Upper Triangular - " + isUpperTriangular(a) + "\n");

		array_dsa.prog_6.displayMatrix(b, "For LowerTriangular");
		System.out.println("Lower Triangular - " + isLowerTriangular(b) + "\n");

		array_dsa.prog_6.displayMatrix(c, "For Diagonal");
		System.out.println("Diagonal - " + isDiagonal(c) + "\n");

		array_dsa.prog_6.displayMatrix(d, "For Identity");
		System.out.println("Identity - " + isIdentity(d) + "\n");
		
		array_dsa.prog_6.displayMatrix(e, "For Tridiagonal");
		System.out.println("Tridiagonal - " + isTridiagonal(e) + "\n");
	}

}

/*
 * OUTPUT -

	For UpperTriangular
	1 2 3 
	0 5 6 
	0 0 9 
	Upper Triangular - true
	
	For LowerTriangular
	1 0 0 
	1 5 0 
	2 3 9 
	Lower Triangular - true
	
	For Diagonal
	1 0 0 
	0 5 0 
	0 0 9 
	Diagonal - true
	
	For Identity
	1 0 0 
	0 1 0 
	0 0 1 
	Identity - true
	
	For Tridiagonal
	1 2 0 0 
	3 1 2 0 
	0 2 1 1 
	0 0 1 1 
	Tridiagonal - true


*/
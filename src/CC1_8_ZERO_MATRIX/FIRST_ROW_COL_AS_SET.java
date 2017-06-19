package CC1_8_ZERO_MATRIX;

/*

1. Check if the first row and first column have any zeros, and set variables rowHasZero and columnHasZero.
 (We'll nullify the first row and first column later, if necessary.)
2. Iterate through the rest of the matrix, setting matrix[ i] [e] and matrix [e] [j] to zero whenever there's a
zero in mat rix [i] [j ].
3. Iteratethroughrestofmatrix,nullifyingrowi ifthere'sazeroinmatrix[i][e].
4. Iterate through rest of matrix, nullifying column j ifthere's a zero in mat rix [e] [j ]. 5. Nullify the first
row and first column, if necessary (based on values from Step 1).
 */
import CtCILibrary.CtCILibrary.AssortedMethods;

public class FIRST_ROW_COL_AS_SET {
	public static void nullifyRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}		
	}

	public static void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}		
	}		
	
	public static void setZeros(int[][] matrix) {
		boolean rowHasZero = false;
		boolean colHasZero = false;		
		
		// Check if first row has a zero
		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				rowHasZero = true;
				break;
			}
		}		
		
		// Check if first column has a zero
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				colHasZero = true;
				break;
			}
		}		
		
		// Check for zeros in the rest of the array
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length;j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
		 		}
			}
		}		
		
		// Nullify rows based on values in first column
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				nullifyRow(matrix, i);
			}
		}		
		
		// Nullify columns based on values in first row
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				nullifyColumn(matrix, j);
			}
		}	
		
		// Nullify first row
		if (rowHasZero) {
			nullifyRow(matrix, 0);
		}
		
		// Nullify first column
		if (colHasZero) {
			nullifyColumn(matrix, 0);
		}
	}	
	
	public static boolean matricesAreEqual(int[][] m1, int[][] m2) {
		if (m1.length != m2.length || m1[0].length != m2[0].length) {
			return false;
		}
		
		for (int k = 0; k < m1.length; k++) {
			for (int j = 0; j < m1[0].length; j++) {
				if (m1[k][j] != m2[k][j]) {
					return false;
				}
			}
		}	
		return true;
	}
	
	public static int[][] cloneMatrix(int[][] matrix) {
		int[][] c = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				c[i][j] = matrix[i][j];
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int nrows = 10;
		int ncols = 15;
		int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -10, 10);		

		AssortedMethods.printMatrix(matrix);
		
		setZeros(matrix);
		
		System.out.println();
		
		AssortedMethods.printMatrix(matrix);
	}
}

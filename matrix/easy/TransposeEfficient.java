// This program transposes a given matrix efficiently. Transposing a matrix means converting its rows into columns and its columns into rows.
// For example, if the matrix is:
// 1 2 3
// 4 5 6
// 7 8 9
// The output should be:
// 1 4 7
// 2 5 8
// 3 6 9
// The program handles both square and non-square matrices. 
// For square matrices, it performs an in-place transpose, while for non-square matrices, it creates a new transposed matrix.
//what are square and non-square matrices?
// A square matrix is a matrix that has the same number of rows and columns. For example, a 3x3 matrix is a square matrix because it has 3 rows and 3 columns. A non-square matrix is a matrix that does not have the same number of rows and columns. For example, a 2x3 matrix is a non-square matrix because it has 2 rows and 3 columns.
// The program first checks if the matrix is square or non-square. If it is square, it performs an in-place transpose by swapping elements across the diagonal. If it is non-square, it creates a new transposed matrix and fills it with the transposed values.
// The program then prints the transposed matrix.
//the only difference between this program and the previous transpose program is that this program is more efficient for square matrices because it does not require additional space for a new matrix. Instead, it modifies the original matrix in place. For non-square matrices, it still creates a new transposed matrix as before.
//if not square then we have to create a new matrix because the original matrix cannot be modified in place. The new matrix will have the number of rows equal to the number of columns of the original matrix and the number of columns equal to the number of rows of the original matrix. This is because when we transpose a matrix, the rows become columns and the columns become rows. Therefore, if the original matrix has r rows and c columns, the transposed matrix will have c rows and r columns.
// The program then fills the new transposed matrix with the transposed values by swapping the indices of the original matrix. Finally, it prints the transposed matrix.
public class TransposeEfficient {

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int r = mat.length;
        int c = mat[0].length;

        if (r == c) {
            // In-place transpose for square matrix
            for (int i = 0; i < r; i++) {
                for (int j = i + 1; j < c; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            // Print transposed matrix
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            // New matrix for non-square case
            int[][] transposed = new int[c][r];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    transposed[j][i] = mat[i][j];//swapping indices
                }
            }

            // Print transposed matrix
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    System.out.print(transposed[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

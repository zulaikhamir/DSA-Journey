//this program transposes a given matrix. Transposing a matrix means converting its rows into columns and its columns into rows.
//for example if the matrix is
//1 2 3 4
//5 6 7 8
//9 10 11 12
//the output should be
//1 5 9
//2 6 10
//3 7 11
//4 8 12
public class Transpose {

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int r = mat.length;
        int c = mat[0].length;

        // Transposed matrix will have size c x r
        // Why is transposed matrix size c x r and not r x c?
//  Because when you transpose a matrix, the rows become columns and columns become rows.
// So if your original matrix has r rows and c columns, the transposed matrix must have c rows and r columns.
        int[][] transposed = new int[c][r];

        // Transposing by swapping indices
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transposed[j][i] = mat[i][j];//swapping indices
            }
        }

        // Printing transposed matrix
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}

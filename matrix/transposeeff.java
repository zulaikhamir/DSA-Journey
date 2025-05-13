
public class transposeeff {

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
                    transposed[j][i] = mat[i][j];
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

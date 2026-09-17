// This program rotates a given matrix by 90 degrees anticlockwise. The rotation is achieved by creating a new matrix and filling it with the rotated values from the original matrix.
// The rotation is achieved by creating a new matrix and filling it with the rotated values from the original matrix.
// For example, if the matrix is:
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// After 90° clockwise rotation:
// 9 5 1
// 10 6 2
// 11 7 3
public class RotateMatrixByAnti90 {//90 degree anticlockwise

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int r = mat.length;
        int c = mat[0].length;

        int[][] temp = new int[c][r];  // note: number of rows and columns swapped!

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                //temp[j][r - i - 1] = mat[i][j];//clockwise
                temp[c - j - 1][i] = mat[i][j];//anticlockwise
            }
        }

        // print rotated matrix
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}


public class RotateMatrixBy90 {//90 degree clockwise

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

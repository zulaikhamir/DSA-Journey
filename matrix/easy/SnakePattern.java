//we are printing the matrix in a snake pattern for example if the matrix is
//1 2 3 4
//5 6 7 8
//9 10 11 12
// the output should be 1 2 3 4 8 7 6 5 9 10 11 12
public class SnakePattern {

    public static void main(String[] args) {

        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int R = mat.length;//no of rows
        int C = mat[0].length;//no of columns in the first row

        for (int i = 0; i < R; i++) {//for each row
            if (i % 2 == 0) {//for even rows we will print from left to right
                for (int j = 0; j < C; j++) {
                    System.out.println(mat[i][j]);

                }
            } else {//for odd rows we will print from right to left
                for (int j = C - 1; j >= 0; j--) {
                    System.out.println(mat[i][j]);
                }

            }
            System.out.println();
        }

    }
}


public class BoundaryElements {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int r = mat.length;
        int c = mat[0].length;

        if (r == 1) {
            for (int i = 0; i < c; i++) {
                System.out.println(mat[0][i]);
            }
        } else if (c == 1) {
            for (int i = 0; i < r; i++) {
                System.out.println(mat[i][0]);
            }
        } else {

// 1️⃣ Print the first/top row from left to right
            for (int i = 0; i < c; i++) {
                // Row is fixed at 0 (top row), column index increases from 0 to c-1
                System.out.println(mat[0][i]);
            }

// 2️⃣ Print the last/rightmost column from top to bottom (excluding the already printed top element)
            for (int i = 1; i < r; i++) {
                // Column is fixed at c-1 (last column), row index increases from 1 to r-1
                System.out.println(mat[i][c - 1]);
            }

// 3️⃣ Print the last/bottom row from right to left (excluding the already printed last element)
            for (int i = c - 2; i >= 0; i--) {
                // Row is fixed at r-1 (last row), column index decreases from c-2 to 0
                System.out.println(mat[r - 1][i]);
            }

// 4️⃣ Print the first/leftmost column from bottom to top (excluding the already printed first and last elements)
            for (int i = r - 2; i >= 1; i--) {
                // Column is fixed at 0 (first column), row index decreases from r-2 to 1
                System.out.println(mat[i][0]);
            }

        }

    }

}

package dp;

public class MinimumCostPath {
    static int row = 3;
    static int col = 3;

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}
        };
        printArray(mat);
        System.out.println("Minimum Cost: " + minCost(mat));
    }

    private static void printGap() {
        System.out.println("+++++++++++++++++++++++");
    }

    private static int minCost(int[][] mat) {
        //for first col
        for (int i = 1; i < row; i++) {
            mat[i][0] = mat[i][0] + mat[i - 1][0];
        }
        printArray(mat);

        //for first row
        for (int i = 1; i < col; i++) {
            mat[0][i] = mat[0][i] + mat[0][i - 1];
        }
        printArray(mat);

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                mat[i][j] += Math.min(mat[i - 1][j - 1], Math.min(mat[i - 1][j], mat[i][j - 1]));
            }
        }
        // Returning the value in
        // last cell
        printArray(mat);
        return mat[row - 1][col - 1];
    }

    private static void printArray(int[][] mat) {
        for (int[] row : mat) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        printGap();
    }
}

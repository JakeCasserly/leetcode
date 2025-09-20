class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n-1-row; col++) {
                //int temp = matrix[col][n-row-1];
                int temp = matrix[row][col];
                matrix[row][col] = matrix[n-col-1][row];
                matrix[n-col-1][row] = matrix[n-1-row][n-1-col];
                matrix[n-1-row][n-1-col] = matrix[col][n-1-row];
                matrix[col][n-1-row] = temp;
                // matrix[col][n-row-1] = matrix[row][col];
                // int temp2 = matrix[n-row-1][n-row-1];
                // matrix[n-row-1][n-row-1] = temp;
                // temp = matrix[n-row-1][row];
                // matrix[n-row-1][row] = temp2;
                // matrix[row][col] = temp;
            }
        }
    }
}

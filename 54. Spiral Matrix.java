class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(matrix.length != 0) {
            //navigateRowCol(matrix, 0, matrix.length, matrix[0].length, 0);     // wall1 (top wall) starts at 
            int m = matrix.length;
            int n = matrix[0].length;
            int i = 0;
            int j = 0;
            int upWall = 0;
            int rightWall = n;
            int downWall = m;
            int leftWall = -1;
            int direction = 1;

            while (result.size() != m*n) {
                if (direction == 0) {
                    while(i > upWall) {
                        result.add(matrix[i][j]);
                        i--;
                    }
                    i = i + 1; // return in bounds
                    j = j + 1; // next col
                    upWall++;
                    direction = 1;
                }
                else if (direction == 1) {
                    while(j < rightWall) {
                        result.add(matrix[i][j]);
                        j++;
                    }
                    j = j - 1; // return in bounds
                    i = i + 1; // next row
                    rightWall--;
                    direction = 2;
                }
                else if (direction == 2) {
                    while(i < downWall) {
                        result.add(matrix[i][j]);
                        i++;
                    }
                    i = i - 1; // return in bounds
                    j = j - 1; // next col
                    downWall--;
                    direction = 3;
                }
                else if (direction == 3) {
                    while(j > leftWall) {
                        result.add(matrix[i][j]);
                        j--;
                    }
                    j = j + 1; // return in bounds
                    i = i - 1; // next row
                    leftWall++;
                    direction = 0;
                }
            }
            return result;
        }
        else {
            return null;
        }
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    if (checkAround(grid, row, col)) {
                        islands++;
                    }
                }
            }
        }
        return islands;
    }

    public boolean checkAround(char[][] grid, int row, int col){
        grid[row][col] = '0';
        if (row-1 >= 0) {
            if (grid[row-1][col] == '1') {
                checkAround(grid, row-1, col);
            }
        }
        if (col+1 < grid[0].length) {
            if (grid[row][col+1] == '1') {
                checkAround(grid, row, col+1);
            }
        }
        if (col-1 >= 0) {
            if (grid[row][col-1] == '1') {
                checkAround(grid, row, col-1);
            }
        }
        if (row+1 < grid.length) {
            if (grid[row+1][col] == '1') {
                checkAround(grid, row+1, col);
            }
        }
        return true;
    }
}

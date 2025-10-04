class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        Queue<int[]> islandToCheck = new LinkedList<>();
        int maxArea = 0;
        int[][] sunk = grid;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    islandToCheck.add(new int[]{i, j});
                    sunk[i][j] = 0;
                    int area = bfs(islandToCheck, grid, 1, sunk);
                    if (area >= maxArea) {
                        maxArea = area;
                    }
                }
            }
        }

        return maxArea;
    }

    private int bfs(Queue<int[]> land, int[][] grid, int area, int[][] sunk) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while(!land.isEmpty()) {
            int[] currentLoc = land.poll();
            for (int[] dir : directions) {
                int newRow = currentLoc[0] + dir[0];
                int newCol = currentLoc[1] + dir[1];
                if (newRow >= 0 && newRow < r && newCol >= 0 && newCol < c && grid[newRow][newCol] == 1 && sunk[newRow][newCol] == 1) {
                    area++;
                    sunk[newRow][newCol] = 0;
                    land.add(new int[]{newRow, newCol});
                }
            }
        }
        return area;
    }
}

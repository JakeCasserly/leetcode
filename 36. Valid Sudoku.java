class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> chars = new HashSet();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (chars.contains(board[i][j])) {
                        return false;
                    }
                    chars.add(board[i][j]);
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> chars = new HashSet();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (chars.contains(board[j][i])) {
                        return false;
                    }
                    chars.add(board[j][i]);
                }
            }
        }

        int[][] starts = {{0, 0}, {0, 3}, {0, 6},
                            {3, 0}, {3, 3}, {3, 6},
                            {6, 0}, {6, 3}, {6, 6}};

        for (int[] start : starts) {
            Set<Character> chars = new HashSet();
            for (int i = start[0]; i < start[0]+3; i++) {
                for (int j = start[1]; j < start[1]+3; j++) {
                    if (board[i][j] != '.') {
                        if (chars.contains(board[i][j])) {
                            return false;
                        }
                        chars.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}
